package com.hamilton.seconds;

public class SwitchStatements {
    public static void main(String[] args) {
        // Switch Statement
        String gender = "FEMALE";
        switch (gender) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer not say");
                break;
            default:
                System.out.println("Unknown gender");
        }
    }
}
