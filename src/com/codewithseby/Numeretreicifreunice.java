package com.codewithseby;

/*

39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. Go to the editor
Expected Output

123
124
...

431
432
Total number of the three-digit-number is 24
 */

import java.util.Scanner;

public class Numeretreicifreunice {
    public static void main(String[] args) {

        int amount = 0;
        for (int i = 1; i <= 4; i++) {   //i = 1,2,3,4 // Loop-ul se va repeta de 4 ori pentru ca sunt 4 cifre pe care le poate lua un numar

            for (int j = 1; j <= 4; j++) {    //i = 1,2,3,4 // Loop-ul se va repeta de 4 ori

                for (int k = 1; k <= 4; k++) {      //i = 1,2,3,4 // Loop-ul se va repeta de 4 ori. Ia valoarea 1 de la primele 2 loop-uri
                    // dupa care repeta ultimul loop de 4 ori pana da false. Dupa aceea ia valoarea 1 de la primul loop si  2 de la al
                    // doilea loop si iar repeta ultimul loop complet cu 1 , 2 ,3 ,4.
                    //Adica ordinea de executare a loop-urilor este de la inner loop la principal loop.
                    if (k != i && k != j && i != j) {         //Ii zici ca vrei sa fie numere unice .
                        amount++;
                        System.out.println(i + "" + j + "" + k);   // Printeze numerele de cate 3 cifre. Trebuie pus "" spatiu intre cifre ca sa nu le adune.
//System.outul de mai sus se puna aici ca sa vada toate cele 3 variabile declarate in blocurile de coduri declarate.
                    }

                }
            }
        }
        System.out.println(amount);
    }
}


