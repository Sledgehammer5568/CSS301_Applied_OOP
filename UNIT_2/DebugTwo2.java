/**
 * Filename DebugTwo2.java
 *
 * Coded by Emanuel Ramos
 * 10/18/2023
 *
 * Debugging Exercise 2-2
 *
 * // this is the original code provided
 * public class DebugTwo2
 * public static void main(String args[])
 * {
 *    {
 *       int a, b;
 *       a = 7
 *       b = 4;
 *       System.out.println("The sum is " + a + b);
 *       System.out.println("The difference is " + a - b);
 *       System.out.println("The product is " + a * b)
 *    }
 * }
 */

// this is the start of my code
class DebugTwo2 {  // remove 'public' and add '{'
    public static void main(String args[]) {
        int a, b;
        a = 7;  // add ';' to end
        b = 4;
        System.out.println("The sum is " + (a + b));  // add '(' and ')'
        System.out.println("The difference is " + (a - b));  // add '(' and ')'
        System.out.println("The product is " + (a * b));  // add '(' and ')' and ';'
    }
}