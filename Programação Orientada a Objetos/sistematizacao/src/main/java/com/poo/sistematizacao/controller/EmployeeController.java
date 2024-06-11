package com.poo.sistematizacao.controller;

import org.springframework.web.bind.annotation.*;

import com.poo.sistematizacao.model.Employee;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(value ="/employees")
public class EmployeeController {
    private Map<String, Employee> employeeRepository = new HashMap<>();

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeRepository.put(employee.getId(), employee);
        return employee;
    }
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeRepository.get(id);
    }
    
}
