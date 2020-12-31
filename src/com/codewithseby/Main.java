package com.codewithseby;

/*
La 99 am ajuns
 */

import java.io.File;

public class Main {
    public static int g(int a) {
        if (a < 9) {
            return 9;
        }

        if (a < 7) {
            return 7;
        }

        if (a < 4) {
            return 4;
        }

        return 0;
    }
            public static void main (String[]args){
                System.out.println(g(5));

            }
        }


