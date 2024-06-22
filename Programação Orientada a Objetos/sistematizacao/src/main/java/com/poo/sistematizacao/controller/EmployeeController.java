package com.poo.sistematizacao.controller;

import org.springframework.web.bind.annotation.*;

import com.poo.sistematizacao.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    private List<Employee> employeeRepository = new ArrayList<>();

    @PostMapping
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        employeeRepository.addAll(employees);
        return employees;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable String id) {
        Optional<Employee> employee = employeeRepository.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
        return employee.orElse(null);  // Return null if not found, handle this better in real applications
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository;
    }
}
