package com.codewithseby;

import java.util.Arrays;

public class Arrayofobjectssorting implements Comparable<Arrayofobjectssorting> {
    public String name;
    public String size;

//Constructor
    public Arrayofobjectssorting(String name, String size) {
        this.name = name;
        this.size = size;
    }


//Metoda de comparare a obiectelor . De studiat cum ce inseamna formula de mai jos de la return????
    @Override
    public int compareTo(Arrayofobjectssorting objectparametru) {
        return this.name.compareTo(objectparametru.name);

    }

    public static void main(String args[]) {



        Arrayofobjectssorting[] arrayitems = {new Arrayofobjectssorting("Zoro", "M"), new Arrayofobjectssorting("Andrei2", "L")};
        //  Arrayofobjectssorting obj = new Arrayofobjectssorting("John", "M");


        for (int i = 0; i < arrayitems.length; i++) {
            System.out.println("Original " + arrayitems[i].name);
        }

        Arrays.sort(arrayitems);

        // Array sitem care face loop prin obiectele arrayitems
        for (Arrayofobjectssorting sitem : arrayitems) {

            //Returneaza toate proprietatile "name" ale obiectelor din Array-ul arrayitems
            System.out.println("Sorted  " + sitem.name);
        }

    }
}

