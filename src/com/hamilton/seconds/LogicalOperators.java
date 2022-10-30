package com.hamilton.seconds;

public class LogicalOperators {

    public static void main(String[] args) {
        // Logical Operators
        boolean isAdult = false;
        boolean isStudent = false;
        boolean isHamiltonMediaMember = true;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);

        System.out.println((isAdult || isStudent) && isHamiltonMediaMember);
        // The exclamation "!" represents the opposite logical value
        System.out.println((!isAdult || isStudent) && !isHamiltonMediaMember);
        System.out.println(!isAdult);
        String name = "Terence";
        System.out.println(
                (10 > 8 || 2 <= 2)
                        && isAdult
                        && name.contains("T"));
    }
}
