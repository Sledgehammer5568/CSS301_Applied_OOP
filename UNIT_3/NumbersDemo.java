/**
 * Filename NumbersDemo.java
 *
 * Coded by Emanuel Ramos
 * 11/13/2023
 *
 * Programming Exercise 3-4A
 *
 * // this is the original code provided
 * public class NumbersDemo {
 *     public static void main (String args[]) {
 *         // Write your code here
 *     }
 *     public static void displayTwiceTheNumber(int n) {
 *         // Write your code here
 *     }
 *     public static void displayNumberPlusFive(int n) {
 *         // Write your code here
 *     }
 *     public static void displayNumberSquared(int n) {
 *         // Write your code here
 *
 *     }
 * }
 *
 * Instructions:
 * Modify the NumbersDemo application whose main() method
 * holds two integer variables. Assign values to the variables.
 *
 * In turn, pass each value to methods named
 * displayTwiceTheNumber(), displayNumberPlusFive(), and displayNumberSquared().
 *
 * Create each method to perform the task its name implies.
 *
 * An example of the program is shown below:
 * 4 times 2 is 8
 * 4 plus 5 is 9
 * 4 squared is 16
 * 33 times 2 is 66
 * 33 plus 5 is 38
 * 33 squared is 1089
 */

// this is the of my code
public class NumbersDemo {
    public static void main (String args[]) {
        // Write your code here

        // variables
        int num1 = 4;
        int num2 = 33;

        // send num1 to functions and show output
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        // send num2 to functions and show output
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int n) {
        // Write your code here
        int total = n * 2;

        System.out.println(n + " times 2 is " + total);
    }
    public static void displayNumberPlusFive(int n) {
        // Write your code here
        int total = n + 5;

        System.out.println(n + " plus 5 is " + total);
    }
    public static void displayNumberSquared(int n) {
        // Write your code here
        int total = n * n;

        System.out.println(n + " squared is " + total);
    }
}