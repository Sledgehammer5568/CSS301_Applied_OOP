/**
 * Filename PaintCalculator.java
 *
 * Coded by Emanuel Ramos
 * 11/15/2023
 *
 * Programming Exercise 3-8
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * public class PaintCalculator {
 *     public static void main (String args[]) {
 *         // Write your code here
 *     }
 *
 *     public static double computeArea(double length, double width, double height) {
 *         // Write your code here
 *     }
 *     public static double computeGallons(double area) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions
 * Assume that a gallon of paint covers about 350 square feet of wall
 * space. Create an application with a main() method that prompts
 * the user for the length, width, and height of a rectangular room.
 * Pass these three values to a method that does the following:
 *
 * - Calculates the wall area for a room
 * - Passes the calculated wall area to another method that calculates
 *   and returns the number of gallons of paint needed
 * - Displays the number of gallons needed
 * - Computes the price based on a paint price of $32 per gallon,
 *   assuming that the painter can buy any fraction of a gallon
 *   of paint at the same price as a whole gallon
 * - Returns the price to the main() method
 *
 * The main() method displays the final price. For example:
 * You will need 2.0 gallons
 * The price to paint the room is $64.0
 */

// this is the start of my code
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String args[]) {
        // create scanner object for input
        Scanner input = new Scanner(System.in);

        // variables
        double length, width, height;

        // ask user for length
        System.out.println("Input the length >> ");
        length = input.nextDouble();

        // ask user for width
        System.out.println("Input the width >> ");
        width = input.nextDouble();

        // ask user for height
        System.out.println("Input the height >> ");
        height = input.nextDouble();

        // variables calculated by other functions
        double area = computeArea(length, width, height);
        double gallonsNeeded = computeGallons(area);

        // calculate the price to paint room
        final double PRICE_PER_GALLON = 32;
        double price = gallonsNeeded * PRICE_PER_GALLON;

        // display gallons needed and the price
        System.out.println("You will need " + gallonsNeeded + " gallons");
        System.out.println("The cost to paint the room is $" + price);
    }

    public static double computeArea(double length, double width, double height) {
        // variables
        double area;

        // calculate area
        area = length * height * 2 + width * height * 2;

        // return the area for use in other functions
        return area;
    }

    public static double computeGallons(double area) {
        // variables
        final double GALLON_COVERAGE = 350;
        double gallonsNeeded;

        // calculate gallons needed
        gallonsNeeded = Math.ceil(area / GALLON_COVERAGE);

        // return gallonsNeeded
        return gallonsNeeded;
    }
}