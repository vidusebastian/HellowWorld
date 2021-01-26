package com.codewithseby;


public class Main {


    public static void main(String[] args) {
        int f = 4;

        boolean g = false  || (f++ < 4);
        System.out.println(f);
    }
}