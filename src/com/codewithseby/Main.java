package com.codewithseby;

/*
107
 */

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        int[] array_nums = {11, 15, 13, 10, 45, 20};


        for ( int i=1; i < array_nums.length; i++)

            array_nums [i-1] = array_nums[i];

            array_nums [array_nums.length-1] = array_nums[0];


        System.out.print(Arrays.toString(array_nums));
    }
}