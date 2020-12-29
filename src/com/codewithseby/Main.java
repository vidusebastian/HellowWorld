package com.codewithseby;

/*
64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers. Go to the editor
Sample Output:

Input the first number : 35
Input the second number: 45
Result: true

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int weeks = 3;
        int days = 7;

        // outer loop
        for(int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop
            for(int j = 1; j <= days; ++j) {

                // continue inside the inner loop

                System.out.println(i+ "  Days: " + j);
            }
        }
    }
}