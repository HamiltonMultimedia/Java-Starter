package com.hamilton.seconds;

public class DoWhileLoop {

    public static void main(String[] args) {
        // Do While Loop is similar to while loop with a "do" block.
        int count = 0;
        // This code is guaranteed to run at least once.
        do {
            System.out.println(count);
            count++;
        }

        while (count <= 20);
    }
}
