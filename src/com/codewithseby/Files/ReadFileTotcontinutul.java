package com.codewithseby.Files;

import java.util.Scanner;
import java.io.*;

public class ReadFileTotcontinutul {
    public static void main(String[] args) {
        try {
            File obj = new File("filename.txt");
            Scanner scanner = new Scanner(obj);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("An error has occured. See the bellow stackstrace: ");
            e.printStackTrace();
        }
    }
}