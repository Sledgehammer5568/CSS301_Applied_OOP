/**
 * Filename DebugTwo4.java
 *
 * Coded by Emanuel Ramos
 * 10/04/2023
 *
 * Debugging Exercise 2-4
 *
 * // this is the original code provide
 * import java.util.*;
 * public class DebugTwo4
 * {
 *    public static void main(String[] args)
 *    {
 *       Scanner input = new Scanner(System.in);
 *       string costString;
 *       double cost;
 *       final TAX = 0.06;
 *       System.out.println("Enter price of item you are buying");
 *       costString = input.next();
 *       cost = Double.parsedouble(coststring);
 *       System.out.println("With " + TAX * 100 +
 *       "% tax,  purchase  is $" + cost + cost * TAX);
 *    }
 * }
 */

// this is the start of my code
import java.util.Scanner;
public class DebugTwo4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String costString;
        double cost;
        final double TAX = 0.06;
        System.out.println("Enter price of item you are buying");
        costString = input.next();
        cost = Double.parseDouble(costString);
        System.out.println("With " + (TAX * 100) +
                "% tax, purchase  is $" + (cost + (TAX * cost)));
    }
}