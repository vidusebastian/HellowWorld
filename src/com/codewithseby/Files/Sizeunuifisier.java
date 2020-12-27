package com.codewithseby.Files;

import java.io.File;

public class Sizeunuifisier {
    public static void Sizeunuifisier(String x) {
        double fisierlungime = new File(x).length();
        System.out.println(fisierlungime+ " bytes");
        System.out.printf( "%.2f MB" , fisierlungime/ 1024 / 1024);
    }
}


