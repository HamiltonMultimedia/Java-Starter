package com.hamilton.seconds;

import java.util.Arrays;

public class UserDefinedMethods {

    public static void main(String[] args) {
        // Methods
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        // Method Invocation or usage, extracted into a variable.
        int count = countOccurrences(letters, 'D');
        System.out.println(count);
    }

    // countOccurrences() Method Definition
    public static int countOccurrences(char [] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        return count;
    }
}
