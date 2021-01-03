package com.codewithseby;

public class Ifurimultiecureturnuri {

    public static int g() {
        if (5 < 9) {
            return 9;
    }

        if (5 < 7) {
            return 7;
        }

        if (5 < 4) {
            return 4;
        }

        return 0;
    }
    public static void main (String[]args){
        System.out.println(g());     // Va printa doar primul if statement care este TRUE

    }
}


