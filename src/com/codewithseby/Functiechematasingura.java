package com.codewithseby;

// Adica programul va face suma de  0+1+2+3+4 = 10

public class Functiechematasingura {
    public static void main(String[] args) {
        int result = sum(4);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
