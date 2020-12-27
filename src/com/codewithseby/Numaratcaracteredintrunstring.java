package com.codewithseby;

public class Numaratcaracteredintrunstring {

    public static void main(String[] args) {

        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        count(test);

    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {                //Se uita folosind indexul Arrayul la pozitia fiecarui caracter din lista de array
                // si vede daca este litera sau nu .
                letter++;     // Aici face loop prin tot array si unde gaseste TRUE ca a gasit o litera o adauga la variabila letter si face suma.

            } else if (Character.isDigit(ch[i])) {

                num++;
            } else if (Character.isSpaceChar(ch[i])) {

                space++;
            } else {

                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("number:  " + num);
        System.out.println("space:  " + space);
        System.out.println("other:  " + other);
    }
}