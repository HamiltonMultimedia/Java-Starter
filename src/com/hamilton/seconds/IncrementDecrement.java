package com.hamilton.seconds;

public class IncrementDecrement {

    public static void main(String[] args) {
        // Symbols "++" and "--" are increment and decrement operators
        int [] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        // Counts up with increment
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Counts down with decrement
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Quick IntelliJ shourtcuts to writing for-loops.
        // array.for    "for (T item : expression)"
        // array.fori   "for (int i = 0; i < expr.length; i++)"
        // array.forr   "for (int i = expr.length-1; i <= 0; i--)"

    }
}
