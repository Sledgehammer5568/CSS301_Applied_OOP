/**
 * Filename Dollars.java
 *
 * Coded by Emanuel Ramos
 * 11/12/2023
 *
 * Programming Exercise 2-14
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * class Dollars {
 *     public static void main(String[] args) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * Write a program that calculates and displays the
 * conversion of an entered number of dollars into
 * currency denominations—20s, 10s, 5s, and 1s.
 *
 * An example of the program is shown below:
 * $452 converted is 22 $20s, 1 $10s, 0 $5s, and 2 $1s.
 */

// this is the start of my code
import java.util.Scanner;
class Dollars {
    public static void main(String[] args) {
        // Write your code here

        // make scanner object for input
        Scanner input = new Scanner(System.in);

        // variables
        int dollarAmount;
        int twenties, tens, fives, ones;
        int remainderAfterTwenties, remainderAfterTens;

        // ask user for dollar amount
        System.out.println("Enter the dollar amount you would like to convert >>");
        dollarAmount = input.nextInt();

        // calculate the number of $20s
        twenties = dollarAmount / 20;

        // calculate remainder after $20s have been chosen
        remainderAfterTwenties = dollarAmount % 20;

        // calculate the number of $10s
        tens = remainderAfterTwenties / 10;

        // calculate the remainder after $10s have been chosen
        remainderAfterTens = remainderAfterTwenties % 10;

        // calculate the number of $5s
        fives = remainderAfterTens / 5;

        // calculate the number of $1s
        ones = remainderAfterTens % 5;

        // display the output
        System.out.println("$" + dollarAmount + " converted is " + twenties + " $20s, " + tens + " $10s, " + fives +
                " $5s, and " + ones + " $1s");
    }
}