package com.codewithseby;

public class HRApp {

    public static void main(String[] args) {

        Department[] departamente = {new Department("HR"), new Department("Resurse Umane")};
        System.out.println(departamente[0].getName());

        Department d1 = new Department("HROBIECT");

        Employee [] angajati = { new Employee(1, "Andrei", 2000), new Employee(2, "Boboc", 3000)};

        d1.addEmployees(angajati);

        for (Employee angvaloare : d1.getEmployees()) {
            System.out.println("Employees output: " + angvaloare);
        }




    }
}
