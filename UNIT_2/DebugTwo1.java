/**
 * Filename DebugTwo1.java
 *
 * Coded by Emanuel Ramos
 * 10/18/2023
 *
 * Debugging Exercise 2-1
 *
 * // this is the original code provided
 * public class DebugTwo1
 * {
 *    public static void main(String[] args)
 *    {
 *       integer oneInt = 315;
 *       double oneDouble = 12.4;
 *       character oneChar = 'A';
 *       System.out.print("The int is ");
 *       System.out.println(oneint);
 *       System.out.print("The double is ");
 *       System.out.println(onDouble);
 *       System.out.print("The char is ");
 *       System.out.println(oneChar);
 *    }
 * }
 */

// this is the start of my code
public class DebugTwo1
{
    public static void main(String[] args)
    {
        int oneInt = 315;  // Fix: change 'integer' to 'int'
        double oneDouble = 12.4;
        char oneChar = 'A';  // Fix: change 'Character' to 'Char'
        System.out.print("The int is ");
        System.out.println(oneInt);  // Fix: change 'oneint' to 'oneInt'
        System.out.print("The double is ");
        System.out.println(oneDouble);  // Fix: change 'onDouble' to 'oneDouble'
        System.out.print("The char is ");
        System.out.println(oneChar);
    }
}