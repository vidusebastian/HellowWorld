package com.codewithseby;

public class Department {

    private String name;
    private Employee[] employees = new Employee[10];

    public Department(String pName) {
        name = pName;
    }

    public String toString () {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// Adaugam angajati in array
    public void addEmployees(Employee[] someEmployees ) {
        employees = someEmployees;
    }

    public Employee[] getEmployees() {
        return employees ;
    }


    public double totalsalary () {
        double total=0;
        for (Employee angvaloare : employees) {
           total = total + angvaloare.getSalary() ;
        }
        return total;
    }

    public double avgsalary () {
        double avgsalariu = 0;
        for (Employee angvaloare : employees) {
            avgsalariu = avgsalariu + angvaloare.getSalary();
        }
        return avgsalariu / employees.length;
    }

    public int identificatoremployee (int pident) {
       return 0;
        }

    }





