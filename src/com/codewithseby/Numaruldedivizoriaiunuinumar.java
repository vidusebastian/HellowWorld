package com.codewithseby;

public class Numaruldedivizoriaiunuinumar {

    public static void main(String[] args) {
        int x = 25;

        System.out.println(result(x));
    }
    public static int result(int num) {
        int ctr = 0;
        for(int i=1; i<=(int)Math.sqrt(num); i++) {          // Generam intervalul de numere care pot fi divizorii unui numar dat
            //{  1 , 2 ......... 25}
            if(num % i==0 && i*i!=num) {                     // Daca 25 % 1   == 0 . Rest 0 0 =0 //   TRUE i = 1 , 5 , 25
                                                             //  1 * 1 = 1  diferit de 25
                                                             //  5 * 5 = 25  = 25
                                                             //  25 * 25 = 625 diferit de 25
                                                             // Deci de 2 ori este adevarat , de face loop-ul de 2 ori TRUE.
                ctr+=2;                                      // Aduna 2  + 2  = 4 la ctr.   DAr ne da 3 ????? De ce ?


            } else if (i*i==num) {
                ctr++;
            }
        }
        return ctr;
    }
}


