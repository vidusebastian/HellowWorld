package com.codewithseby.Folders;

import java.io.File;
import java.nio.file.DirectoryNotEmptyException;


public class Deletefolder {
    public static void main(String[] args) {
        try {
            File obj = new File("C:\\Users\\SEBY\\Downloads\\test1");
            if (obj.delete()) {
                System.out.println("Folder " + obj + " deleted with succes");
            } else {
                System.out.println("Cannot delete the folder");
            }
        } catch (Exception e) {
            System.out.println("An error has occurend");
            e.printStackTrace();
        }
    }
}