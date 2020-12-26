package com.codewithseby.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Writetofileandreadallcontent {
    public static void Writetofileandreadallcontent(String x) {
        try {
            FileWriter obj = new FileWriter(x, true);
            BufferedWriter buffer = new BufferedWriter(obj);

            // Scriem in fisier in buffer pentru performanta
            buffer.write("\njava1 is fun at w3schools!!!!");  // daca vrem sa scrie la infinit in fisier punem comanda in for loopul asta //  for ( int i =0 ; i<10; i=0) {   }
            buffer.close();

            //Citim tot continutul fisierului
            File obj1 = new File(x);
            Scanner scanner = new Scanner(obj1);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            System.out.println();
        } catch (Exception e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}

