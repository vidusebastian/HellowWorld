package com.codewithseby.hrapp.casestudy;

import java.awt.image.ReplicateScaleFilter;

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


  public String toString () {
        return "Employee" + " " + id + " " +  name + " " + salary ;
    }
}

