/**
 * Filename Percentages2,java
 *
 * Coded by Emanuel Ramos
 * 11/13/2023
 *
 * Programming Exercises 3-5B
 *
 * // this is the original code provided
 * public class Percentages2
 * {
 *    public static void main (String args[])
 *    {
 *       double num1 = 2.0, num2 = 5.0;
 *       computePercent(num1, num2);
 *       computePercent(num2, num1);
 *    }
 *    public static void computePercent(double x, double y)
 *    {
 *        // Modify the code below
 *        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
 *    }
 * }
 *
 * Instructions:
 * Modify the Percentages2 class derived from
 * Chapter 3 Exercise 5A to accept the values of
 * the two doubles from a user at runtime.
 *
 * An example of the program is shown below:
 * Enter a double >> 2.5
 * Enter another double >> 5.0
 * 2.5 is 50.0 percent of 5.0
 * 5.0 is 200.0 percent of 2.5
 */

// this is the start of my code
import java.util.Scanner;
public class Percentages2
{
    public static void main (String args[])
    {
        // create scanner object for input
        Scanner input = new Scanner(System.in);

        // variables
        double num1, num2;

        // ask user for input of num1
        System.out.println("Enter a double >> ");
        num1 = input.nextDouble();

        // ask user for input of num2
        System.out.println("Enter another double >> ");
        num2 = input.nextDouble();

        // calling function
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double x, double y)
    {
        // Modify the code below
        System.out.println(x + " is " + (x / y) * 100 + " percent of " + y);
    }
}