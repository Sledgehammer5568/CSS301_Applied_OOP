/**
 * Filename BookstoreCredit.java
 *
 * Coded by Emanuel Ramos
 * 10/18/2023
 *
 * Programming Exercise 3-6
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * public class BookstoreCredit {
 *     public static void main (String args[]) {
 *         // Write your code here
 *     }
 *
 *     public static void computeDiscount(String name, double gpa) {
 *         // Write your code here
 *     }
 *
 * }
 *
 * Instructions:
 * To encourage good grades, Hermosa High School has decided to
 * award each student a bookstore credit that is 10 times the
 * student’s grade point average.
 *
 * In other words, a student with a 3.2 grade point average receives a
 * $32.0 credit.
 *
 * Create an application that prompts a student for a name and
 * grade point average, and then passes the values to a method
 * (computeDiscount) that displays a descriptive message. The
 * message uses the student’s name, echoes the grade point
 * average, and computes and displays the credit.
 *
 * An example of the program is shown below:
 * Enter your name >> John
 * Enter your gpa >>3.4
 * John, your  GPA is 3.4, so your credit is $34.0
 */


import java.util.Scanner;
public class BookstoreCredit {
    public static void main (String args[]) {
        // Write your code here

        // variables
        String name;
        double gpa;

        // create scanner
        Scanner input = new Scanner(System.in);

        // ask for name
        System.out.println("Enter your name >> ");
        name = input.nextLine();

        // ask for GPA
        System.out.println("Enter your gpa >>");
        gpa = input.nextDouble();

        // call computeDiscount() to compute the amount of credit
        computeDiscount(name, gpa);
    }

    public static void computeDiscount(String name, double gpa) {
        // Write your code here

        // do math to calculate credits
        double totalDiscount = gpa * 10;

        // display output 
        System.out.println(name + ", your GPA is " + gpa + ", so your credit is $" + totalDiscount);

    }

}