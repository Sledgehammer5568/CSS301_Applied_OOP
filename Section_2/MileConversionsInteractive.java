/**
 * Filename MileConversionsInteractive.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 2-7
 *
 * // this is the original code provided
 * class MileConversionsInteractive
 * {
 *    public static void main(String[] args) {
 *       // Modify the code below
 *       final double INCHES_IN_MILE = 63360;
 *       final double FEET_IN_MILE = 5280;
 *       final double YARDS_IN_MILE = 1760;
 *       double miles = 4;
 *       double in, ft, yds;
 *       in = miles * INCHES_IN_MILE;
 *       ft = miles * FEET_IN_MILE;
 *       yds = miles * YARDS_IN_MILE;
 *       System.out.println(miles + " miles is " + in +
 *          " inches, or " + ft + " feet, or " +
 *          yds + " yards");
 *    }
 * }
 *
 * Requirements:
 * Convert the MileConversions program to
 * an interactive application. Instead of
 * assigning a value to the miles variable,
 * accept it from the user as input.
 *
 * An example of the program is show below:
 * Enter miles >> 4.5
 * 4.5 miles is 285120.0 inches, or 23760.0 feet, or 7920.0 yards
 */

// this is the start of my code
import java.util.Scanner;  // import scanner for input
class MileConversionsInteractive
{
    public static void main(String[] args) {
        // Modify the code below

        // variables
        final double INCHES_IN_MILE = 63360;
        final double FEET_IN_MILE = 5280;
        final double YARDS_IN_MILE = 1760;
        double miles;
        double in, ft, yds;

        // create a scanner object for input
        Scanner input = new Scanner(System.in);

        // take in input and assign it to 'miles'
        System.out.println("Enter miles >> ");
        miles = input.nextDouble();

        in = miles * INCHES_IN_MILE;
        ft = miles * FEET_IN_MILE;
        yds = miles * YARDS_IN_MILE;
        System.out.println(miles + " miles is " + in +
                " inches, or " + ft + " feet, or " +
                yds + " yards");
    }
}