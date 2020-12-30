package com.codewithseby;

/*
La 99 am ajuns



 */

import java.io.File;
public class Main {
    public static void main(String[] args) {
        {
            File file = new File("E:\\Munca\\");
            String[] fileList = file.list();
            for (String name : fileList) {
                System.out.println(name);
            }
        }
    }
}