package com.codewithseby.Files;

import java.io.*;


public class Crearefisier {

    public String Crearefisier (String x) {
        try {
            File obj = new File (x);

            if (obj.createNewFile()) {
                System.out.println ("File created succesufully and the name is : " + obj.getName());
                System.out.println ("File absolute path is: " + obj.getAbsolutePath());

            }
            else {

                System.out.println ("File already exists and the name is: " + obj.getName());
                System.out.println ("File absolute path is: " + obj.getAbsolutePath());
            }
        }
        catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }
}
