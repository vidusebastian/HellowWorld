package com.codewithseby;

import java.util.Scanner;

public class Numarimparverificare {
    public static void mymethod() {

        Scanner obj = new Scanner(System.in);
        System.out.println("Type a number: ");
        int x = obj.nextInt();

        if (x % 2 == 0) {          // 20 : 2 = 10 x2 = 20 = rest 0 .    0 == 0  True
            System.out.println("The number is par :  print 1");
        } else {
            System.out.println("The number is impar: print 0 ");
        }
    }
}