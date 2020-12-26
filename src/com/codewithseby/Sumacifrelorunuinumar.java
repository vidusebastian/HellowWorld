package com.codewithseby;

/*
33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */

import java.util.Scanner;

public class Sumacifrelorunuinumar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        long n = input.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));

    }

    public static int sumDigits(long n) {
        int sum = 0;   // O declaram zero pentru ca sa adaugam la ea cifrele extrase mai jos si sa ne dea suma corecta totala.
        while (n != 0) {

            //Trebuie sa extragem ultima cifra a numarului si dupa aceea sa le adunam . Exemplu de numar 123456.
            // Metoda pentru a extrage ultima cifra a unui numar este sa facem modul de 10 la acel numar.
            // If we do 123456%10 then we will get 6, which is last digit. In order to get all digits we can use a loop, something
            // like while loop.


/// ADUNA suma resturilor. Adica aduna suma cifrelor.
            sum += n % 10;          // 25 modul de 10 = rest 5  ( care e chiar cifra 5 ultima cifra a numarului din dreapta);
            // adica sum = 0 + rest 5 = 5;  sum = 5 ;



            n /= 10;  // Pentru continuarea buclei se foloseste incremental sau decremental in cazul nostru 10. Ca sa ajungem la zero
            // ca sa se opreasca bucla . (0 != 0  adica FALSE) .
            // n = n :10    25:10  = 2.5  rotunjit n =2  ( care e chiar ifra 2 prima cifra a numarului care a mai ramas ;

            /*
            Se repeta bucla din nou :

While (2 != 0 ) {                // CAZUL 2 cand n = 2
sum += 2 % 10;           | 2 modul 10 = rest 2  Adica sum  = 5 + rest 2 = 7   Adica sum = 7
2 /= 10;                |  n = n:10   2:10 = 0.2   rotunjit n = 0;


While (0 != 0 ) {          //CAZUl 3 cand n =0 . Dar 0 nu este diferit de zero deci ne da FALSE bucla. deci se opreste aici bucla.

             */

        }
        return sum;
    }
}



