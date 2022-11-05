package com.hamilton.seconds;

public class ClassesAndObjects {
    // Classes and Objects
    // Classes are the templates used to create Object models
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
        Lens lensThree = new Lens(
                "nikon",
                "30mm",
                false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);
        System.out.println("============================");
        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);
        System.out.println("============================");
        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);
        System.out.println("============================");
    }

    // Defining the Lens class
    static class Lens {
        // Defining properties and their types
        String brand;
        String model;
        String color;
        String price;
        String weight;
        String focalLength;
        boolean isPrime;

        // Defining method that creates the Lens object with defined properties
        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            // The 'this' keyword, refers to "this" current instance of the current class
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.price = price;
            this.weight = weight;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
