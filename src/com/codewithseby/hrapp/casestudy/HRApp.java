package com.codewithseby.hrapp.casestudy;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("The appplication is starting!");
        Department d1 = new Department("Departament Education");

        System.out.println(d1);

        Department[] departamente = {new Department("HR"), new Department("Resurse Umane")};


        Employee e1 = new Employee(1, "John", 400);
        Employee e2 = new Employee(2, "Andrei", 800);


        d1.addEmployees(e1);
        d1.addEmployees(e2);


        for (Employee angvaloare : d1.getEmployees()) {
            System.out.println("Employees are : " + angvaloare);
           // System.out.println("Alta abordare pentru linia de mai sus: " + angvaloare.getId() +  " " + angvaloare.getSalary() + " " + angvaloare.getName());
        }

        System.out.println("Numar de angajati: " + d1.getEmploycount());

        System.out.println("Total salary is: " + d1.getTotalSalary());

        System.out.println("Average salary is: " + d1.avgsalary());



        // Cautare dupa ID employee
        try {
            System.out.println("The employ with the id specified is : " + d1.identificatoremployee(8));
        } catch (NullPointerException n) {
           // n.printStackTrace();
            System.out.println("Try catch aici : There is no employee with that id");
        }


    }
}
