/**
 * Filename JobPricing.java
 *
 * Coded by Emanuel Ramos
 *
 * Programming Exercise 3-10
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * class JobPricing {
 *     public static void main(String[] args) {
 *         String description;
 *         double materials;
 *         double hoursOnJob;
 *         double hoursTraveling;
 *         double price;
 *         Scanner input = new Scanner(System.in);
 *         System.out.print("Enter job description >> ");
 *         description = input.nextLine();
 *         System.out.print("Enter cost of materials >> ");
 *         materials = input.nextDouble();
 *         System.out.print("Enter hours on the job work >> ");
 *         hoursOnJob = input.nextDouble();
 *         System.out.print("Enter hours traveling >> ");
 *         hoursTraveling = input.nextDouble();
 *         price = computePrice(materials, hoursOnJob, hoursTraveling);
 *         System.out.println("The price for " + description +
 *                            " is $" + price);
 *     }
 *
 *     public static double computePrice(double materials, double hours, double travel) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * Herbert’s Home Repair estimates each job cost as the
 * cost of materials plus $35 per hour while on the job,
 * plus $12 per hour for travel time to the job site.
 *
 * The main() method prompts the user for the name
 * of a job (for example, Smith bathroom remodel), the
 * cost of materials, the number of hours of work
 * required, and the number of hours travel time.
 *
 * Pass the numeric data to a method that computes an
 * estimate for the job and returns the computed value
 * to the main() method which displays the job name
 * and estimated price.
 *
 * An example of the program is shown below:
 * Enter job description >> Room 210 Kitchen
 * Enter cost of materials >> 5,000
 * Enter hours on the job work >> 120
 * Enter hours traveling >> 0
 * The price for Room 210 Kitchen is $9200.0
 */

// this is the start of my code
import java.util.Scanner;
class JobPricing {
    public static void main(String[] args) {
        String description;
        double materials;
        double hoursOnJob;
        double hoursTraveling;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter job description >> ");
        description = input.nextLine();
        System.out.print("Enter cost of materials >> ");
        materials = input.nextDouble();
        System.out.print("Enter hours on the job work >> ");
        hoursOnJob = input.nextDouble();
        System.out.print("Enter hours traveling >> ");
        hoursTraveling = input.nextDouble();
        price = computePrice(materials, hoursOnJob, hoursTraveling);
        System.out.println("The price for " + description +
                " is $" + price);
    }

    public static double computePrice(double materials, double hours, double travel) {
        // Write your code here

        // variables
        final double HOURLY_PAY = 35;
        final double TRAVEL_PAY = 12;
        double price;

        // calculate price
        price = materials + (hours * HOURLY_PAY) + (travel * TRAVEL_PAY);

        // return price to display in main
        return price;
    }
}