/**
 * Filename ChiliToGoProfit.java
 *
 * Coded by Emanuel Ramos
 * 11/12/2023
 *
 * Programming Exercise 2-13
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * class ChiliToGoProfit
 * {
 *   public static void main(String[] args) {
 *       // Modify the code below
 *       final double ADULT_PRICE = 7;
 *       final double CHILD_PRICE = 4;
 *       int adultMeals;
 *       int childMeals;
 *       double totalAdult, totalChild, grandTotal;
 *       Scanner input = new Scanner(System.in);
 *       System.out.print("Enter number of adult meals ordered >> ");
 *       adultMeals = input.nextInt();
 *       System.out.print("Enter number of child meals ordered >> ");
 *       childMeals = input.nextInt();
 *       totalAdult = adultMeals * ADULT_PRICE;
 *       totalChild = childMeals * CHILD_PRICE;
 *       grandTotal = totalAdult + totalChild;
 *       System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + " each.");
 *       System.out.println("      Total is " + totalAdult);
 *       System.out.println(childMeals + " child meals were ordered at " + CHILD_PRICE + " each.");
 *       System.out.println("      Total is " + totalChild);
 *       System.out.println("Grand total for all meals is " + grandTotal);
 *    }
 * }
 *
 * Instructions:
 * In the ChiliToGo program in Exercise 12, the costs to produce an adult meal
 * and a child’s meal are $4.35 and $3.10, respectively. Adult meals are sold for $7.00
 * and children's meals are sold for $4.00. Modify the ChiliToGo program to
 * display the total profit for each type of meal as well as the grand total profit.
 *
 * An example of the program is shown below:
 * Enter number of adult meals ordered >> 10
 * Enter number of child meals ordered >> 5
 * 10 adult meals were ordered at 7.0 each.
 *       Total is 70.0
 * 5 child meals were ordered at 4.0 each.
 *       Total is 20.0
 * Grand total for all meals is 90.0
 * Profits:
 *       Adult profit is 26.5
 *       Child profit is 4.5
 * Total profit is 31.0
 */

// this is the start of my code
import java.util.Scanner;
class ChiliToGoProfit
{
    public static void main(String[] args) {
        // Modify the code below

        // make scanner object for input
        Scanner input = new Scanner(System.in);

        // variables
        final double ADULT_PRICE = 7;
        final double CHILD_PRICE = 4;
        final double ADULT_PRODUCE_COST = 4.35;
        final double CHILD_PRODUCE_COST = 3.10;
        int adultMeals;
        int childMeals;
        double totalAdult, totalChild, grandTotal;
        double totalAdultProfit, totalChildProfit, totalProfit;

        // ask for user to input adult meals
        System.out.print("Enter number of adult meals ordered >> ");
        adultMeals = input.nextInt();

        // ask user to input child meals
        System.out.print("Enter number of child meals ordered >> ");
        childMeals = input.nextInt();

        totalAdult = adultMeals * ADULT_PRICE;  // calculate total price of adult meals
        totalChild = childMeals * CHILD_PRICE;  // calculate total price of child meals
        grandTotal = totalAdult + totalChild;  // calculate grand total
        totalAdultProfit = totalAdult - (adultMeals * ADULT_PRODUCE_COST);  // calculate total adult profit
        totalChildProfit = totalChild - (childMeals * CHILD_PRODUCE_COST);  // calculate totals child profit
        totalProfit = totalAdultProfit + totalChildProfit;  // calculate total profit
        System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + " each.");
        System.out.println("      Total is " + totalAdult);
        System.out.println(childMeals + " child meals were ordered at " + CHILD_PRICE + " each.");
        System.out.println("      Total is " + totalChild);
        System.out.println("Grand total for all meals is " + grandTotal);
        // display adult profit, child profit and total profit
        System.out.println("Profits:\n" +
                "      Adult profit is " + totalAdultProfit + "\n" +
                "      Child profit is " + totalChildProfit + "\n" +
                "Total profit is " + totalProfit);
    }
}