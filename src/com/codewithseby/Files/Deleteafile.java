package com.codewithseby.Files;

import java.io.*;

public class Deleteafile {
   public static void  Deleteafile (String x) {
        try {
            File obj= new File(x);
            if (obj.delete()) {
                System.out.println ("Deleted the file " + obj);
            }
            else {
                System.out.println("Cannot delete file");
            }

        } catch (Exception e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }

    }
}

