package com.hamilton.variables;

import java.time.LocalDate;
import java.util.Date;

public class variables {
    public static void main(String[] args) {
        // Types of variables
        int number = 100;
        double Number = 100.01;
        String brand = "Hamilton Multimedia";
        Date date = new Date();
    }
    public static void wholeNumbers(String[] args) {
        // Types of whole numbers
        // Use underscores for visualization
        byte theByte = -128;
        short theShort = 8_989; // 8 Thousand
        int theInt = 787_838_334; // 787 Million
        long theLong = 78_783_833_432L; // 78 Billion

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
    }
    public static void fractions(String[] args) {
        // Types of fraction numbers
        float pi = 3.14F;
        double doublePi = 3.14159;

        System.out.println(pi);
        System.out.println(doublePi);
    }
    public static void otherUnions(String[] args) {
        // Types of union variables
        boolean isAdult = true;
        char nameInitial = 'A';

        System.out.println(isAdult);
        System.out.println(nameInitial);
    }
    public static void nonPrimitives(String[] args) {
        // Non-primitive data types AKA reference types
        // They always start with a capital letter
        // Attributes and methods can be chained using dot notation
        String name = new String("Hamilton");
        // Method chain example
        System.out.println(name.toUpperCase());
    }



}
