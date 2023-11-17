/**
 * Filename Insurance.java
 *
 * Coded by Emanuel Ramos
 *
 * Programming Exercise 3-9
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * class Insurance {
 *     public static void main (String args[]) {
 *         // Write your code here
 *     }
 *
 *     public static int calculatePremium(int curr, int birth) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * The Harrison Group Life Insurance company computes annual policy
 * premiums based on the age the customer turns in the current
 * calendar year. The premium is computed by taking the decade of the
 * customer’s age, adding 15 to it, and multiplying by 20.
 *
 * For example, a 34-year-old would pay $360, which is calculated by
 * adding the decades (3) to 15, and then multiplying by 20.
 *
 * Write an application that prompts a user for the current year then a
 * birth year. Pass both to a method that calculates and returns the
 * premium amount, and then display the returned amount.
 *
 * An example of the program is shown below:
 * Enter the current year >> 2020
 * Enter the birth year >> 2001
 * The premium is $320
 */

// this is the start of my code
import java.util.Scanner;
class Insurance {
    public static void main (String args[]) {
        // Write your code here

        // variables
        int currentYear, birthYear;

        // create scanner object for input
        Scanner input = new Scanner(System.in);

        // ask user for current year
        System.out.println("Enter the current year >> ");
        currentYear = input.nextInt();

        // ask user for birth year
        System.out.println("Enter the birth year >> ");
        birthYear = input.nextInt();

        // call calculatePremium() to calculate premium
        int premium = calculatePremium(currentYear, birthYear);

        // display premium
        System.out.println("the premium is $" + premium);
    }

    public static int calculatePremium(int curr, int birth) {
        // Write your code here

        // variables
        int decade;
        int premium;

        // calculate decade
        decade = curr - birth;

        // calculate premium
        premium = (decade / 10 + 15) * 20;

        // return premium to be displayed in main
        return premium;
    }
}