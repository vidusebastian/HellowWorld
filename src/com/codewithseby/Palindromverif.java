package com.codewithseby;

import java.util.Arrays;

// 1. Convertim stringul introdus intr-un array de caractere
// 2. Copiem valorile array-ului original in alt array pentru comparare pentru punctul (4).
// 3. Loop prin primul array  dar pana la jumatatea indexului adica la litera din mijloc si  Arrayul original devine reverse
// 4. Comparam cele 2 arrayuri cu equals si printam daca este sau nu palindrom


public class Palindromverif {
    public static void main(String args[]) {

        String sintrodus = "ABCBA";

        char[] myArray = sintrodus.toCharArray();
        char [] original = Arrays.copyOf(myArray,myArray.length);

        for (int i = 0; i < myArray.length / 2; i++) {  // Imparte la 2 ca sa ajunga la indexul pana la litera din mijloc fara ea.
            char temp = myArray[i];        // Salveaza valorile array-ului in variabila char
            myArray[i] = myArray[myArray.length-i-1];       // ? e in plus linia asta? Override la indexul array-ului Original  myarray[0] = myarray [4]  myaray[1] = myarray [3]
            myArray[myArray.length-i-1] = temp;   // Override la valoarile din primul array  myarray [4] = "A"
        }
        System.out.println("Original Array"+Arrays.toString(original));
        System.out.println("Reverse Array"+Arrays.toString(myArray));

        if(Arrays.equals(myArray, original)) {
            System.out.println("Entered string is a palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }
    }
}


/*
Sau varianta mea 2
package com.codewithseby;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // A B A C
        // 0 1 2 3
        String original = "ABAC";
        char[] ch = original.toCharArray();
        System.out.println("ch.lenght = " + ch.length);

        char[] reversea = new char[ch.length];
        int i = 0;
        for (i = ch.length - 1; i >= 0; i--) {   // i = 3 , 2 , 1 , 0   // ch.lenght = 4
            //   System.out.println(ch[i]);
            reversea[ch.length - i - 1] = ch[i];              //  ceva = 0 , 1 , 2 , 3
        }


        String x = Arrays.toString(ch);
        System.out.println("x " + x);

        String y = Arrays.toString(reversea);

        System.out.println("y " + y);

//        if (x.equals(y)) {
//            System.out.println("Palindrom");
//        } else {
//            System.out.println("Is not palindrom");
//        }

        if (Arrays.equals(ch, reversea)) {
            System.out.println("palindrom");
        } else {
            System.out.println("Not palindrom");

        }
    }
}



 */