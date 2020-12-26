package com.codewithseby.Files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class WriteToFile {
    public static String WriteToFile (String x) {
        try {
            FileWriter obj = new FileWriter(x, true);
            File obj1 = new File(x);
            obj.write("Java is for fun for coding and w3schools\n" );
            obj.close();
            System.out.println("A scris ceva in fisierul " + obj1.getName() + " de la locatia " + obj1.getAbsolutePath());
        }
        catch (IOException e) {
            System.out.println("A dat o eroare");
            e.printStackTrace();
        }

        return null;
    }

}