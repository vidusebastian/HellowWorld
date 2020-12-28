package com.codewithseby;
/*



 */

public class Main {

    public static void main(String[] args) {
        int x = 25;
        System.out.println(mymethod(x));
    }

    public static int mymethod(int number) {
int ctr=0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if ( number % i ==0 && i*i!=number) {
                ctr+=2;
            } else if (i*i==number) {
                ctr++;
            }


        }

        return ctr;
    }

}