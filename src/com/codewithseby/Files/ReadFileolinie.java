package com.codewithseby.Files;

import java.io.File;  // Import the File class
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files



public class ReadFileolinie {
    public static String ReadFileolinie (String x) {
        try {
            File obj = new File(x);
            Scanner myscanner = new Scanner(obj);
            System.out.println(myscanner.nextLine());
        }
        catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
        return null;
    }

}