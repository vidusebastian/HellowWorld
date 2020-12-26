package com.codewithseby;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {



        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(2,"Ferari");
        System.out.println (cars.get(2));
        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}