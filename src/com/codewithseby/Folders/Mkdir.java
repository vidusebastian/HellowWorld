package com.codewithseby.Folders;

import java.io.*;

public class Mkdir {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\SEBY\\Downloads\\test1");
            if (obj.mkdir()) {
                System.out.println("Directory created succesufully: " + obj);
            } else {
                System.out.println("Cannot create directory");
            }
        }
    }

