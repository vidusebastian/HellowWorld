package com.codewithseby;


/*
37. Write a Java program to reverse a string. Go to the editor
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
String str = "Welcome to W3 schoolss";
char [] letters = str.toCharArray();

for ( int i = letters.length-1; i>=0; i--) {
    System.out.print (letters[i]);
}


    }
}