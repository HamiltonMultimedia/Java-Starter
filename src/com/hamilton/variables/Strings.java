package com.hamilton.variables;

public class Strings {
    public static void main(String[] args) {
        // String object is created
        String name = new String("Hamilton");
        // Methods can be performed on the new object
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String code = new String("codes");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
    }
}
