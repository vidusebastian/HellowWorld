package com.codewithseby;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private Employee[] employees;

    public Employee(int pId, String pName, double pSalary) {
        id = pId;
        name = pName;
        salary = pSalary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployees(Employee[] someEmployees) {
        employees = someEmployees;
    }

  public String toString () {
        return id + " " +  name + " " + salary ;
    }
}

