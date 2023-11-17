/**
 * Filename InchesToFeetInteractive.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 2-9
 *
 * // this is the original code provided
 * class InchesToFeetInteractive
 * {
 *   public static void main(String[] args) {
 *       // Modify the code below
 *      final int INCHES_IN_FOOT = 12;
 *      int inches = 86;
 *      int feet;
 *      int inchesLeft;
 *      feet = inches / INCHES_IN_FOOT;
 *      inchesLeft = inches % INCHES_IN_FOOT;
 *      System.out.println(inches + " inches is " +
 *         feet + " feet and " + inchesLeft + " inches");
 *   }
 * }
 *
 * Instructions:
 * Implement an interactive version of
 * the InchesToFeet class that
 * accepts the inches value from a user.
 *
 * An example of the program is shown below:
 * Enter inches >> 200
 * 200 inches is 16 feet and 8 inches
 */

// this is the start of my code
import java.util.Scanner;  // import scanner for input
class InchesToFeetInteractive
{
    public static void main(String[] args) {
        // Modify the code below

        // variables
        final int INCHES_IN_FOOT = 12;
        int inches;
        int feet;
        int inchesLeft;

        // create a scanner object for input
        Scanner input = new Scanner(System.in);

        // ask user for inches
        System.out.println("Enter inches >> ");
        inches = input.nextInt();  // take in input

        // calculation for feet
        feet = inches / INCHES_IN_FOOT;

        // calculation for inches left over
        inchesLeft = inches % INCHES_IN_FOOT;

        // display output
        System.out.println(inches + " inches is " +
                feet + " feet and " + inchesLeft + " inches");
    }
}