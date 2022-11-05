package com.hamilton.seconds;

public class ClassesAndObjects {
    // Classes and Objects
    // Classes are the templates used to create Objects
    // Objects are items that represent things in the real world

    public static void main(String[] args) {
        // Class that creates a new "Lens" Object named "lensOne"
        Lens lensOne = new Lens(
                "sony",
                "85mm",
                true);
        Lens lensTwo = new Lens(
                "canon",
                "50mm",
                true);
    }

    // Defining the Lens class
    static class Lens {
        // Defining properties and their types
        String brand;
        String focalLength;
        boolean isPrime;

        // Defining method that creates the Lens object with defined properties
        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            // The 'this' keyword, refers to "this" current instance of the current class
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
