package com.codewithseby.hrapp.casestudy;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("The appplication is starting!");
        Department d1 = new Department("Departament Education");

        System.out.println(d1);

        Department[] departamente = {new Department("HR"), new Department("Resurse Umane")};


        Employee e1 = new Employee(4, "John", 433);

       // Employee[] angajati = {new Employee(1, "Andrei", 2000), new Employee(2, "Boboc", 3000)};
        Employee[] angajati = new Employee[10];
        d1.addEmployees(angajati);

        for (Employee angvaloare : d1.getEmployees()) {
            System.out.println("Employees are : " + angvaloare);

        }
        try {
            System.out.println("Total salary is: " + d1.totalsalary());
        }
        catch (ArithmeticException a) {
            a.printStackTrace();
            System.out.println("There is no values for salary in the array");
        }

        System.out.println("Average salary is: " + d1.avgsalary());


        // Cautare dupa ID employee

        try {

            System.out.println("The employ with the id specified is : " + d1.identificatoremployee(8));
        }
        catch (NullPointerException n) {
            n.printStackTrace();
            System.out.println("There is no employee with that id");
        }


    }
}
