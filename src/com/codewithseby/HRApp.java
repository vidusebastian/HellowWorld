package com.codewithseby;

public class HRApp {

    public static void main(String[] args) {

        Department[] departamente = {new Department("HR"), new Department("Resurse Umane")};


        Department d1 = new Department("HROBIECT");
        Employee e1 = new Employee (4, "John", 433);

        Employee [] angajati = { new Employee(1, "Andrei", 2000), new Employee(2, "Boboc", 3000)};

        e1.addEmployees(angajati);

        for (Employee angvaloare : e1.getEmployees()) {
            System.out.println("Employees are : " + angvaloare);

        }




    }
}
