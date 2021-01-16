package com.codewithseby;

public class Department {

    private String name;
    private Employee[] employees;

    public Department(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployees(Employee[] someEmployees) {
        employees = someEmployees;
    }
}
