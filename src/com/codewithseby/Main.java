package com.codewithseby;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main  {


    public static void main(String args[]) {
        double tax = 0.2;
        double total = 0.0;


        //  System.out.println("Welcome to Duke CHoice shop");
        Customer c1 = new Customer("Pinky", 3);
        // c1.setName("Pinky");
        // c1.setSize("S");

        System.out.println("The minimum price is : " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");


        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};
        // Array de obiecte  .  se pot declara obiectele
        // direct in array cu numele new Clothing () si nu mai trebuie sa le declaram in liniile de mai sus
        // items[0].size = "J";  // Schimbam size-ul pentru primul obiect din Array adica item1.size = "J" .


        // System.out.println("Item1" + "," + item1.description + "," + item1.price + "," + item1.size);
        // System.out.println("Item2" + "," + item2.description + "," + item2.price + "," + item2.size);

        //Calculeaza totalul
        //   total = (item1.price + item2.price * 2) * (1 + tax);

        //  System.out.println("Total is : " + total);

        int measurement = 8;
        c1.addItems(items);
        // c1.setSize(measurement);
        System.out.println("Customer is " + c1.getName() + " , " + c1.getSize() + " , " + c1.getTotalClothingCost());


        for (Clothing item : c1.getItems()) {
           //System.out.println("Items " + item.getDescription());
            // System.out.println("Item" + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());

            System.out.println("Item output " + item);
        }
        System.out.println("Total is : " + total);
        int average = 0;
        int count = 0;


        for (Clothing item : items) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();

            }
        }

        average = (average == 0) ? 0 : average/count;

        try {
            average = average / count;

            System.out.println("Average is " + average + " and the count is " + count);
        }
        catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println("Dont divide by 0");
        }


        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            //System.out.println("Items " + item.getDescription());
            // System.out.println("Item" + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());

            System.out.println("Item output " + item);
        }
    }
}
