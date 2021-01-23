package com.codewithseby;



public class Main {
    /**
     *
     * @param args comand line arguments
     */

    public static void main(String[] args) {
        System.out.println("args-size= " + args.length);

        for ( int i = 0 ; i < args.length; i++) {
            System.out.println(" args [" + i + " ] =" + args[i]);
        }
        sum()
    }

  
    public static int  sum (int a, int b) {
        return a + b;
    }
}