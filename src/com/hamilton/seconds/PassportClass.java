package com.hamilton.seconds;

import java.time.LocalDate;

public class PassportClass {

    public static void main(String[] args) {
        // Classes
        Passport usPassport = new Passport("123", "America", LocalDate.of(2025,1,1));
        Passport ukPassport = new Passport("12399", "England", LocalDate.of(2030,1,1));
    }
    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
