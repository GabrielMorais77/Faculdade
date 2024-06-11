package com.poo.sistematizacao.model;

public class Employee {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String alergias;
    private String problemas_medicos;

    public String getId() {
        return id;}
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    public String getProblemas_medicos() {
        return problemas_medicos;
    }
    public void setProblemas_medicos(String problemas_medicos) {
        this.problemas_medicos = problemas_medicos;
    }
}
