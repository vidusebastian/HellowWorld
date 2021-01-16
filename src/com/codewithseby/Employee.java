package com.codewithseby;

public class Employee {

    private int id;
    private String name;
    private double salary;


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
}

