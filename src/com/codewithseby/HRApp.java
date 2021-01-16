package com.codewithseby;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("The appplication is starting!");
        Department d1 = new Department("Departament Education");

        System.out.println(d1);

        Department[] departamente = {new Department("HR"), new Department("Resurse Umane")};


        Employee e1 = new Employee(4, "John", 433);

        Employee[] angajati = {new Employee(1, "Andrei", 2000), new Employee(2, "Boboc", 3000), e1};

        d1.addEmployees(angajati);

        for (Employee angvaloare : d1.getEmployees()) {
            System.out.println("Employees are : " + angvaloare);

        }
        System.out.println("Total salary is: " + d1.totalsalary());
        System.out.println("Average salary is: " + d1.avgsalary());


        // Cautare dupa ID employee
        int y = 4;
        System.out.println("Utilizatorul cu ID-ul " + y + " este " + d1.identificatoremployee(y));


    }
}
