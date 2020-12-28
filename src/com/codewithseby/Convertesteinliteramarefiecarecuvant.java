package com.codewithseby;

public class Convertesteinliteramarefiecarecuvant {

    public static void Convertesteinliteramarefiecarecuvant(String x)    {
        if(x == null || x.isEmpty() || x.isBlank()){
            throw new RuntimeException("Error: The string you provided is empty or null. Please provide a string");}
        // stores each characters to a char array
        char[] charArray = x.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if (Character.isLetter(charArray[i])) {

                // check space is present before the letter
                if (foundSpace) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                // if the new character is not character
                foundSpace = true;
            }
        }

        // convert the char array to the string
        x = String.valueOf(charArray);
        System.out.println(x);
    }
}
