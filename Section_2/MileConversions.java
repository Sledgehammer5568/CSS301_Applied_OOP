/**
 * Filename MileConversions.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 2-6
 *
 * // this is the original code provided
 * class MileConversions {
 *     public static void main(String[] args) {
 *         // Write your code here
 *     }
 * }
 *
 * Requirements:
 * Write a program that declares constants to
 * represent the number of inches, feet, and
 * yards in a mile. Name the constants
 * INCHES_IN_MILE, FEET_IN_MILE, and
 * YARDS_IN_MILE respectively. Also declare a
 * variable named miles to represent a number
 * of miles. Compute and display, with
 * explanatory text, the value in inches, feet, and
 * yards—for example: 4.0 miles is 253440.0
 * inches, or 21120.0 feet, or 7040.0 yards
 *
 * Conversions:
 * There are 63,360 inches in a mile, 5,280 feet in
 * a mile, and 1,760 yards in a mile.
 */

// this is the start of my code
class MileConversions {
    public static void main(String[] args) {
        // Write your code here

        // constant variables
        final double INCHES_IN_MILE = 63360.0;  // constant for inches in mile
        final double FEET_IN_MILE = 5280.0;  // constant for feet in mile
        final double YARDS_IN_MILE = 1760.0;  // constant for yards in mile
        double miles = 4;  // initialized variable for miles

        // Calculate miles to inches
        double totalInches = (INCHES_IN_MILE * miles);

        // Calculate miles to feet
        double totalFeet = (FEET_IN_MILE * miles);

        // Calculate miles to yards
        double totalYards = (YARDS_IN_MILE * miles);

        // display output
        System.out.println(miles + " miles is " + totalInches + " inches, or " + totalFeet + " feet, or " + totalYards + " yards");
    }
}