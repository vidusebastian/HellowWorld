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
            myArray[i] = myArray[myArray.length-i-1];       // Override la indexul array-ului Original  myarray[0] = myarray [4]  myaray[1] = myarray [3]
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
