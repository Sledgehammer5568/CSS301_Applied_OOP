/**
 * Filename DebugTwo3.java
 *
 * Coded by Emanuel Ramos
 * 10/18/2023
 *
 * Debugging Exercise 2-3
 *
 * // this is the original code provided
 * public class DebugTwo3
 * {
 *    public static void main(String args[]
 *    {
 *       int a = 99 b = 8, result;
 *       long c = 7777777777777;
 *       result = a % b
 *       System.out.println("Divide " + a + " by " + b);
 *       System.out.println("remainder is " + result);
 *       System.out.print("c is a very large number: ");
 *       System.out.println(c);
 *     }
 * }
 */

// this is the start of my code
public class DebugTwo3 {
    public static void main(String args[]) {
        int a = 99;
        int b = 8;
        long c = 7777777777777L;
        int result = a % b;
        System.out.println("Divide " + a + " by " + b);
        System.out.println("remainder is " + result);
        System.out.print("c is a very large number: ");
        System.out.println(c);
    }
}