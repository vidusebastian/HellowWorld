package com.codewithseby.Loops;

public class Arrayloopuri {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Volvo", "Lambo", "Ferari"};
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        //printam toate valorile Array-ului
        for (String i : cars) {
            System.out.println(i);
        }
        //printam toate valorile din Array-ul two-dimensional
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
