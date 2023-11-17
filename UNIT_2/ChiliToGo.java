/**
 * Filename ChiliToGo.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 2-12
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * class ChiliToGo {
 *     public static void main(String[] args) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * The Huntington Boys and Girls Club is conducting a
 * fundraiser by selling chili dinners to go. The price is $7.00
 * for an adult meal and $4.00 for a child’s meal. Write a
 * program that accepts the number of adult meals ordered
 * and then children's meals ordered. Display the total money
 * collected for adult meals, children’s meals, and all meals.
 *
 * An example of the program is shown below:
 * Enter number of adult meals ordered >> 10
 * Enter number of child meals ordered >> 5
 * 10 adult meals were ordered at 7.0 each.
 *       Total is 70.0
 * 5 child meals were ordered at 4.0 each.
 *       Total is 20.0
 * Grand total for all meals is 90.0
 */

// this is the start of my code
import java.util.Scanner;
class ChiliToGo {
    public static void main(String[] args) {
        // Write your code here

        // create the scanner object
        Scanner input = new Scanner(System.in);

        // make constant variables for price
        final double ADULT_PRICE = 7.00;
        final double CHILD_PRICE = 4.00;

        // create variables to store input
        int adultCount;
        int childCount;

        // variables for calculations
        double adultTotal;
        double childTotal;

        // prompt user for input
        System.out.println("Enter number of adult meals ordered >> ");
        adultCount = input.nextInt();
        System.out.println("Enter number of child meals ordered >> ");
        childCount = input.nextInt();

        // calculate totals
        adultTotal = adultCount * ADULT_PRICE;
        childTotal = childCount * CHILD_PRICE;

        // display total
        System.out.println(adultCount + " adult meals were ordered at " + ADULT_PRICE + " each.");
        System.out.println("\tTotal is " + adultTotal);

        System.out.println(childCount + " child meals were ordered at " + CHILD_PRICE + " each.");
        System.out.println("\tTotal is " + childTotal);

        System.out.println("Grand total for all meals is " + (adultTotal + childTotal));

    }
}