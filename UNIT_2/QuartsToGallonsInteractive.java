/**
 * Filename QuartsToGallonsInteractive.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 2-5
 *
 * // this is the original code provided
 * class QuartsToGallonsInteractive
 * {
 *    public static void main(String[] args)
 *    {
 *       // Modify the code below
 *       final int QUARTS_IN_GALLON = 4;
 *       int quartsNeeded = 18;
 *       int gallonsNeeded;
 *       int extraQuartsNeeded;
 *       gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
 *       extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
 *       System.out.println("A job that needs " + quartsNeeded +
 *          " quarts requires " + gallonsNeeded + " gallons plus " +
 *          extraQuartsNeeded + " quarts.");
 *    }
 * }
 *
 * Instructions:
 * Convert the QuartsToGallons program
 * to an interactive application. Instead
 * of assigning a value to the number of
 * quarts, accept the value from the user
 * as input.
 *
 * An example of the program is shown below:
 * Enter quarts needed >> 20
 * A job that needs 20 quarts requires 5 gallons plus 0 quarts.
 */

// this is the start of my code
import java.util.Scanner;  // import scanner for input
class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        // create a scanner object for input
        Scanner input = new Scanner(System.in);

        // Modify the code below
        final int QUARTS_IN_GALLON = 4;

        // ask user to input quarts
        System.out.println("Enter quarts needed >> ");
        int quartsNeeded = input.nextInt();  // take in input and assign it to quartsNeeded

        int gallonsNeeded;  // variable for gallons needed
        int extraQuartsNeeded;  // variable for extra quarts needed

        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;  // calculate amount of gallons needed
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;  // calculate the remainder for extra quarts needed

        // print out prompt
        System.out.println("A job that needs " + quartsNeeded +
                " quarts requires " + gallonsNeeded + " gallons plus " +
                extraQuartsNeeded + " quarts.");
    }
}