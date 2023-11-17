/**
 * Filename Eggs.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 2-11
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * class Eggs {
 *     public static void main(String[] args) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * Meadowdale Dairy Farm sells organic brown eggs to local
 * customers. It charges $3.25 for a dozen eggs, or 45 cents for
 * individual eggs that are not part of a dozen. Write a program that
 * prompts a user for the number of eggs in the order and then
 * display the amount owed with a full explanation using the following wording:
 * You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.
 *
 */

// this is the start of my code
import java.util.Scanner;
class Eggs {
    public static void main(String[] args) {
        // Write your code here

        // variables
        final int EGGS_IN_DOZEN = 12;
        final double PRICE_OF_DOZEN = 3.25;
        final double PRICE_OF_EGG = 0.45;
        int eggsOrdered;
        int dozenNeeded;
        int eggsLeft;
        double total;

        // create a scanner object for input
        Scanner input = new Scanner(System.in);

        // ask for number of eggs needed and assign it to eggsOrdered
        System.out.println("How many eggs do you need >> ");
        eggsOrdered = input.nextInt();  // add input to eggsOrdered

        // calculate how many dozen of eggs they need
        dozenNeeded = eggsOrdered / EGGS_IN_DOZEN;

        // calculate eggs left to complete order
        eggsLeft = eggsOrdered % EGGS_IN_DOZEN;

        // calculate total price of eggs
        total = (dozenNeeded * PRICE_OF_DOZEN) + (eggsLeft * PRICE_OF_EGG);

        // display prompt
        System.out.println("You ordered " + eggsOrdered + " eggs. That's " + dozenNeeded +
                " dozen at $" + PRICE_OF_DOZEN + " per dozen and " + eggsLeft + " loose eggs at " +
                ((int)(PRICE_OF_EGG * 100)) + " cents each for a total of $" + total + ".");
    }
}