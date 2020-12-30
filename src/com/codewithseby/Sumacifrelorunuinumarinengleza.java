package com.codewithseby;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sumacifrelorunuinumarinengleza {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int sum = 0;
            System.out.println("Enter a number: ");
            String str = br.readLine();   // 87    sau pentru ultimul caz de test 9999999999999999999999999
            char[] numStr = str.toCharArray();  // {8,7}



            for (int i = 0; i < numStr.length; i ++) {       //  i = { 0 , 1 }
                sum += Character.getNumericValue(numStr[i]);           //   8 + 7 = 15   sum = 15
            }
            System.out.println("Original Number: "+str);      // 87
            print_number(sum);              // parametrul 15 la metoda print_number
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print_number(int n) {                    // n = 15
        int x; int y; int z;            // ????
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};  // Toate 10  valori de cuvinte pe care le poate lua o cifra tradusa in engleza
        System.out.println("Sum of the digits of the said number: "+n);

        if (n < 10) {             // Daca 15 < 10  FALSE
            System.out.println(number[n]);      // number[15]
        }
        else if (n < 100) {        // 15 < 100  TRUE            144<100 FALSE
            x = n / 10;                   // x = 15 /10 = 1,5 = 1
            y = n - x *10;                // y = 15 - 15/10 * 10 = 15 - 1,5 * 10 = 15 - 1 * 10 = 15 -10 = 5         y= 5
            System.out.println("In English: "+number[x] + " " + number[y]);   // one + five
        }
        else {               // n= 225 deci intra pe acest else
            x = n / 100;                   // x =225 / 100 = 2,25 = 2
            y = (n - x * 100) / 10;        // y = (225 - 2*100 )  / 10 = 2.5 = 2
            z = n - x * 100 - y * 10;      // z = 225 - 2*100 - 2 *10 =  225 - 200 - 20 = 5
            System.out.println("In English: "+number[x] + " " + number[y] + " " + number[z]);  //  index 2 + index 2 + index 5 = two two five
        }

    }
}