package com.hamilton.seconds;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // Arrays
        int zero = 0;
        int one = 1;

        int [] numbers = {2, 0, 1, 4, 100};

        // Arrays can only have the amount of elements it is assigned to hold
//        int [] numbers = new int[3];
//        numbers[0] = 0;
//        numbers[1] = 1;
//        numbers[2] = 2;
//        numbers[3] = 24;

        String [] letters = new String[3];
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);
    }
}
