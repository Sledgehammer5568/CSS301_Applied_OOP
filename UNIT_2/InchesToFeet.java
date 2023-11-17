/**
 * Filename InchesToFeet.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 2-8
 *
 * // this is the original code provided
 * class InchesToFeet {
 *     public static void main(String[] args) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * Write a program that declares a variable
 * named inches, which holds a length in
 * inches, and assign a value. Display the
 * value in feet and inches; for example: 86
 * inches is 7 feet and 2 inches. Be sure to
 * use a named constant where appropriate.
 */

// this is the start of my code
class InchesToFeet {
    public static void main(String[] args) {
        // Write your code here

        // variables
        int inches = 86;
        final int INCHES_IN_FEET = 12;
        int leftOverInches;
        int feet;

        // calculate feet from inches
        feet = inches / INCHES_IN_FEET;

        // calculate left over inches
        leftOverInches = inches % INCHES_IN_FEET;

        // display output
        System.out.println(inches + " inches is " + feet + " feet and " + leftOverInches + " inches");
    }
}