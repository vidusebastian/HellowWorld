package com.codewithseby;

public class Constructormodel {

    int x,y;
    private  int  z= 13;
    //Constructor
    public Constructormodel (int x, int y, int z) {
        this.x= x;
        this.y=y;
        this.z=z;  // cand chemam variabila z dintr-un obiect va da valoare parametrului pus pe obiect. Alt caz Daca z = z va da valoarea lui z = 13.
    }
    public int getZ () {
        return z;
    }

    public int mymethod(Main other) {
        return this.x + this.y + x +y ;

    }

    public static void main(String[] args) {




    }
}
