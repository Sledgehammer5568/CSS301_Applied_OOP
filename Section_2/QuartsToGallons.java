/**
 * Filename QuartsToGallons.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 2-4
 *
 * // this is the original code provided
 * // QuartsToGallons.java
 * class QuartsToGallons {
 *     public static void main(String[] args) {
 *         // Write your code here
 *     }
 * }
 *
 * Requirements:
 * Write a program that declares a
 * constant named QUARTS_IN_GALLON
 * which holds the number of quarts in a
 * gallon (there are 4 quarts to a gallon).
 * Also declare a variable named
 * quartsNeeded to represent the
 * number of quarts needed for a
 * painting job, and assign an appropriate
 * value. Compute and display the
 * number of gallons and quarts needed
 * for the job. Display explanatory text
 * with the values.
 * For example:
 * A job that needs 18 quarts requires 4 gallons plus 2 quarts.
 */

// this is the start of my code
// QuartsToGallons.java
class QuartsToGallons {
    public static void main(String[] args) {
        // Write your code here

        // declare a constant named QUARTS_IN_GALLON
        final int QUARTS_IN_GALLON = 4;


        // assign the value 18 to quartsNeeded
        int quartsNeeded = 18;

        // calculate gallons needed from quartsNeeded
        int totalGallons = (quartsNeeded / QUARTS_IN_GALLON);

        // calculate remaining quarts needed from quartsNeeded
        int totalQuarts = (quartsNeeded % QUARTS_IN_GALLON);

        System.out.print("A job that needs " + quartsNeeded + " quarts requires " + totalGallons + " gallons plus " + totalQuarts + " quarts");
    }
}