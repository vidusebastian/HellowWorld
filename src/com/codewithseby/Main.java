package com.codewithseby;


public class Main {


    public static void main(String args[]) {
        double tax = 0.2;
        double total = 0.0;


        //  System.out.println("Welcome to Duke CHoice shop");
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        // System.out.println("Customer is " + c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();


        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};  // Array de obiecte  .  se pot declara obiectele
        // direct in array cu numele new Clothing () si nu mai trebuie sa le declaram in liniile de mai sus
        // items[0].size = "J";  // Schimbam size-ul pentru primul obiect din Array adica item1.size = "J" .

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";


        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        items[2].description = "Green Scarf";
        items[2].price = 5;
        items[2].size = "S";

        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";


        // System.out.println("Item1" + "," + item1.description + "," + item1.price + "," + item1.size);
        // System.out.println("Item2" + "," + item2.description + "," + item2.price + "," + item2.size);

        //Calculeaza totalul
        //   total = (item1.price + item2.price * 2) * (1 + tax);

        //  System.out.println("Total is : " + total);

        int measurement = 3;

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                c1.setSize("R");
                break;
            case 7:
            case 8:
            case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }
        for (Clothing item : items) {
            if (c1.getSize().equals(item.size )) {
                total = total + item.price;  // 0 + 20.9 = 20.9   // total = 20.9 + 10.5 = 31.4 // total = 31.4
                System.out.println("Item" + "," + item.description + "," + item.price + "," + item.size);
            if (total> 15) {
                break;
              }
            }


        }
        System.out.println("Total is : " + total);

    }
}
