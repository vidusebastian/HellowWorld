package com.codewithseby;
/*



 */

public class Main {

    public static void main(String[] args) {
        int ctr = 0;
        for (int i = 1; i <= 25; i++) {

            if (5 % i == 0 && i*i!=25) {
                ctr += 2;

            }
        }
        System.out.println (ctr);
    }
}