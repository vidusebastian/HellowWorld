package com.codewithseby;

import java.util.Scanner;

public class Convertestesecundeinoreminutesecunde {
    public static void Convertestesecundeinoreminutesecunde ()    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input total: ");
        int total = in.nextInt();
        int secunde = total % 60;   // Afla restul din numarul total de secunde
        int ore = total / 60;   // Convertim totalul de secunde in minute
        int minute = ore % 60;  // Afla restul din numarul total de minute
        ore = ore / 60;         // Afla numarul de ore
        System.out.print(ore + ":" + minute + ":" + secunde);
        System.out.print("\n");
    }
}

