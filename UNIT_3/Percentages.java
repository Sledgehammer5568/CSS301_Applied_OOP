/**
 * Filename Percentages.java
 *
 * Coded by Emanuel Ramos
 * 11/13/2023
 *
 * Programming Exercise 3-5A
 *
 * // this is the original code provided
 * public class Percentages {
 *     public static void main (String args[]) {
 *         // Write your code here
 *     }
 *     public static void computePercent(double x, double y) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * Modify the Percentages application whose main() method holds two
 * double variables. Assign values to the variables.
 *
 * Pass both variables to a method named computePercent() that
 * displays the two values and the value of the first number as a percentage
 * of the second one. For example, if the numbers are 2.0 and 5.0, the
 * method should display a statement similar to “2.0 is 40.0 percent of 5.0.”
 *
 * Then call the method a second time, passing the values in reverse order.
 *
 * For testing use the values 2.0 and 5.0.
 *
 * An example of the program is shown below:
 * 2.0 is 40.0 percent of 5.0
 * 5.0 is 250.0 percent of 2.0
 */

// this is the start of my code
public class Percentages {
    public static void main (String args[]) {
        // Write your code here

        // varibles
        double num1 = 2.0, num2 = 5.0;

        // send numbers to function
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double x, double y) {
        // Write your code here
        System.out.println(x + " is " + ((x / y) * 100) + " percent of " + y);
    }
}