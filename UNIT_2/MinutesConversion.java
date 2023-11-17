/**
 * Filename MinutesConversion.java
 *
 * Coded by Emanuel Ramos
 * 11/12/2023
 *
 * Programming Exercise 2-15
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * public class MinutesConversion {
 *     public static void main(String[] args) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * Write a program that accepts a number of minutes and converts it both to hours and days.
 *
 * An example of the program is show below:
 * 6000 minutes is 100.0 hours or 4.166666666666667 days
 */

// this is the start of my code
import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args) {
        // Write your code here

        // create scanner object for input
        Scanner input = new Scanner(System.in);

        // variables
        int minutes;
        double hours, days;
        final int MINUTES_IN_HOUR = 60;
        final int MINUTES_IN_DAY = 1440;

        // ask user for minutes to convert
        System.out.println("Enter the number of minutes >>");
        minutes = input.nextInt();

        // convert minutes to hours
        hours = (double) minutes / MINUTES_IN_HOUR;

        // convert minutes to days
        days = (double) minutes / MINUTES_IN_DAY;

        // display output
        System.out.println(minutes + " minutes is " + hours + " hours or " + days + " days");
    }
}