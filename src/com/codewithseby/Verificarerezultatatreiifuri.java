package com.codewithseby;
/*
Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array

 */
public class Verificarerezultatatreiifuri {
    public static void main(String[] args) {
        {
            int[] ch = {10, 70, 80, 50, 20, 13, 50};
            boolean foundt = false;
            int result = 0;
            // Trebuie sa verificam daca doua indexuri sunt adevarate in acelasi timp

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 10) {
                    foundt = true;
                }
                if (foundt && ch[i] == 20) {    // Adica valoare de la primul IF care era TRUE o aducem in al doilea IF. ca sa facem
                    // verificarea daca ambele statementuri sunt TRUE pentru indecsi diferiti
                    System.out.println("TRUE");
                    result = 1;     // Rezultatul de aici daca este TRUe , result =1 daca este false result = 0  si il verificam mai jos
                }

            }
            if (result == 0) {              // Nu ajunge la statementul asta in cazul de fata
                System.out.println("FALSE");
            }
        }
    }
}
