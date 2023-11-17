/**
 * Filename InchConversion.java
 *
 * Coded by Emanuel Ramos
 * 10/18/2023
 *
 * Programming Exercise 3-7
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * public class InchConversion {
 *     public static void main (String args[]) {
 *         // Write your code here
 *     }
 *
 *     public static void convertToFeet(int inches) {
 *         // Write your code here
 *     }
 *     public static void convertToYards(int inches) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * Modify the class named InchConversion. Its main()
 * method accepts a value in inches from a user at the
 * keyboard, and in turn passes the entered value to two
 * methods. One converts the value from inches to feet, and
 * the other converts the same value from inches to yards.
 *
 * There are 12 inches in a foot and 3 feet in a yard.
 *
 * Each method displays the results with appropriate explanation.
 *
 * An example of the program is shown below:
 * Enter inches >> 430
 * 430 inches is 35.833333333333336 feet
 * 430 inches is 11.944444444444445 yards
 */

// this is the start of my code
import java.util.Scanner;
public class InchConversion {
    public static void main (String args[]) {
        // Write your code here

        // variables
        int inches;

        // create scanner
        Scanner input = new Scanner(System.in);

        // ask user for inches
        System.out.println("Enter inches >> ");
        inches = input.nextInt();

        // call convertToFeet() to convert inches to feet and display output
        convertToFeet(inches);

        // call convertToYards() to convert inches to yards and display output
        convertToYards(inches);

    }

    public static void convertToFeet(int inches) {
        // Write your code here

        // constant for INCHES_IN_FEET
        final double INCHES_IN_FEET = 12;

        // do math to convert inches to feet
        double feet = inches / INCHES_IN_FEET;

        // display output
        System.out.println(inches + " inches is " + feet + " feet");
    }
    public static void convertToYards(int inches) {
        // Write your code here

        // constant for INCHES_IN_YARD
        final double INCHES_IN_YARD = 36;

        // do math to convert inches to feet
        double yards = inches / INCHES_IN_YARD;

        // display output
        System.out.println(inches + " inches is " + yards + " yards");
    }
}