package com.hamilton.seconds;

public class LogicalComparisons {

    public static void main(String[] args) {
        int age = 17;
        System.out.println("...running 1st if statement");
        if (age >= 18) {
            System.out.println("I am of adult age");
        } else {
            System.out.println("I am still a child");
        }
        System.out.println("...running 2nd if statement");
        if (age >= 18) {
            System.out.println("I am of adult age");
        } else if (age >= 16 && age < 18) {
            System.out.println("I might be close to adult age");
        }
    }
}
