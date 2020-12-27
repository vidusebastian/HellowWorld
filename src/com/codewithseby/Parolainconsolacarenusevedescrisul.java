package com.codewithseby;

import java.io.Console;
import java.util.Arrays;

public class Parolainconsolacarenusevedescrisul {
    public static void Parolainconsolacarenusevedescrisul () {
        Console cons;
        if ((cons = System.console()) != null) {      //Verifica daca consola exista
            char[] pass_ward = null;
            try {
                pass_ward = cons.readPassword("Input your Password:");  // Citeste parola pe care o introducem in consola
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if (pass_ward != null) {
                    Arrays.fill(pass_ward, ' ');              //Daca parola e null sa o completeze tot cu null
                }
            }
        } else {
            throw new RuntimeException("Can't get password...No console");
        }
    }
}