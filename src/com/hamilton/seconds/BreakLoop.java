package com.hamilton.seconds;

public class BreakLoop {

    public static void main(String[] args) {
        // Break and continue
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
//        for (String name : names) {
//            if (name.equals("Bob")) {
//                // Break keyword "breaks" or ends the loop
//                break;
//            }
//            System.out.println(name);
//        }

        for (String name : names){
           if (name.startsWith("A")){
               // Continue keyword "continues" back to the top of the loop
               continue;
           }
            System.out.println(name);
        }


    }
}
