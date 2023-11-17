/**
 * Filename NumbersDemo2.java
 *
 * Coded by Emanuel Ramos
 * 11/13/2023
 *
 * Programming Exercise 3-4B
 *
 * // this is the original code provided
 * public class NumbersDemo2
 * {
 * // Modify the code below
 *    public static void main (String args[])
 *    {
 *       int num1 = 4, num2 = 33;
 *       displayTwiceTheNumber(num1);
 *       displayNumberPlusFive(num1);
 *       displayNumberSquared(num1);
 *       displayTwiceTheNumber(num2);
 *       displayNumberPlusFive(num2);
 *       displayNumberSquared(num2);
 *    }
 *    public static void displayTwiceTheNumber(int n)
 *    {
 *       final int FACTOR = 2;
 *       System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
 *    }
 *    public static void displayNumberPlusFive(int n)
 *    {
 *       final int FACTOR = 5;
 *       System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
 *    }
 *    public static void displayNumberSquared(int n)
 *    {
 *       System.out.println(n + " squared is " + (n * n));
 *    }
 * }
 *
 * Instructions:
 * Modify the NumbersDemo2 class to accept the
 * values of the two integers from a user at the keyboard.
 *
 * An example of the program is shown below:
 * Enter an integer >> 2
 * Enter another integer >> 17
 * 2 times 2 is 4
 * 2 plus 5 is 7
 * 2 squared is 4
 * 17 times 2 is 34
 * 17 plus 5 is 22
 * 17 squared is 289
 */

// this is the start of my code
import java.util.Scanner;
public class NumbersDemo2
{
    // Modify the code below
    public static void main (String args[])
    {
        // make scanner object for input
        Scanner input = new Scanner(System.in);

        // variables
        int num1, num2;

        // assign new value from user to num1
        System.out.println("Enter an integer >> ");
        num1 = input.nextInt();

        // assign new value from user to num1
        System.out.println("Enter another integer >> ");
        num2 = input.nextInt();

        // display output
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }
    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}