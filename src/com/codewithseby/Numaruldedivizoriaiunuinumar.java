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
                                                             //  1 * 1 = 1  diferit de 25  TRUE
                                                             //  5 * 5 = 25  = 25   FALSE
                                                             //  25 * 25 = 625 diferit de 25 TRUE
                                                             // Deci o data este TRUE , deci face loop-ul odata.
                ctr+=2;                                      // Adunam 2  la variabila ctr  = 2 (face overide)


            } else if (i*i==num) {                           // 1* 1 = 25 FALSE  5*5= 25  TRUE    25 * 25 = 625 = 25 FALSE
                ctr++;                                       // Adunam 1 la ctr
            }
        }
        return ctr;
    }
}


