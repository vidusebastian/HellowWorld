package com.codewithseby;

public class Convertesteinliteramarefiecarecuvant {

    public static void Convertesteinliteramarefiecarecuvant(String x)    {
       //String x ="the quick brown fox jumps over the lazy dog.";
        if(x == null || x.isEmpty() || x.isBlank()){
            throw new RuntimeException("Error: The string you provided is empty or null. Please provide a string");}
        // stores each characters to a char array
        char[] charArray = x.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if (Character.isLetter(charArray[i])) {                 // i = 0  charArray[0] = litera "t" Daca litera "t" este litera.
                // cand va ajunge la i=3 la spatiul gol dupa cuvantul "the " va face verifica daca spatiul gol este litera si ii va da FALSE
         // si va intra pe else-ul de mai jos care va face foundSpace = TRUE si care va intra din nou pe ultimul inner IF si va face litera mare

                // check space is present before the letter
                if (foundSpace) {                                 // TRUE

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);           // schimba "t" in "T"
                    foundSpace = false;                                //FACE false aici ca se nu mai execute inner if-ul si pentru
                                                                       //celelalte litere cand faci i = 1, 2 ,3 ,4
                }
            } else {                   //Acest else este de la primul if adica  if (Character.isLetter(charArray[i]))
                // if the new character is not character
                foundSpace = true;                // Se va activa cand i va fi = 3 pentru ca primul if va face verificare daca spatiul gol este
                // litera si ii va da false si va intra aici pe acest else.
            }
        }

        // convert the char array to the string
        x = String.valueOf(charArray);
        System.out.println(x);
    }
}
