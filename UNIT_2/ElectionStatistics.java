/**
 * Filename ElectionStatistics.java
 *
 * Coded by Emanuel Ramos
 * 11/12/2023
 *
 * Programming Exercise 2-16
 *
 * // this is the original code provided
 * import java.util.Scanner;
 * class ElectionStatistics {
 *     public static void main(String[] args) {
 *         // Write your code here
 *     }
 * }
 *
 * Instructions:
 * Write a program that accepts the names of three political parties
 * and the number of votes each received in the last mayoral election.
 * Display the percentage of the vote each party received.
 *
 * An example of the program is shown below:
 * Enter name for first party >> Pool Party
 * Enter votes received >> 87
 * Enter name for second party >> House Party
 * Enter votes received >> 54
 * Enter name for third party >> Surprise Party
 * Enter votes received >> 111
 * The Pool Party party got 34.523809523809526 percent of the vote
 * The House Party party got 21.428571428571427 percent of the vote
 * The Surprise Party party got 44.047619047619044 percent of the vote
 */

// this is the start of my code
import java.util.Scanner;
class ElectionStatistics {
    public static void main(String[] args) {
        // Write your code here

        // create scanner object for input
        Scanner input = new Scanner(System.in);

        // variables
        String firstParty, secondParty, thirdParty;
        int firstPartyVotes, secondPartyVotes, thirdPartyVotes, totalVotes;
        double firstPartyPercent, secondPartyPercent, thirdPartyPercent;

        // ask user for input of first party
        System.out.println("Enter name for first party >> ");
        firstParty = input.nextLine();

        // ask user for input of first party votes
        System.out.println("Enter votes received >> ");
        firstPartyVotes = input.nextInt();
        input.nextLine();

        // ask user for input of first party
        System.out.println("Enter name for second party >> ");
        secondParty = input.nextLine();

        // ask user for input of first party votes
        System.out.println("Enter votes received >> ");
        secondPartyVotes = input.nextInt();
        input.nextLine();

        // ask user for input of first party
        System.out.println("Enter name for third party >> ");
        thirdParty = input.nextLine();

        // ask user for input of first party votes
        System.out.println("Enter votes received >> ");
        thirdPartyVotes = input.nextInt();
        input.nextLine();

        // calculate total votes
        totalVotes = firstPartyVotes + secondPartyVotes + thirdPartyVotes;

        // calculate percent of votes for first party
        firstPartyPercent = ((double) firstPartyVotes / totalVotes) * 100;

        // calculate percent of votes for second party
        secondPartyPercent = ((double) secondPartyVotes / totalVotes) * 100;

        // calculate percent of votes for third party
        thirdPartyPercent = ((double) thirdPartyVotes / totalVotes) * 100;

        // display first party percent of votes
        System.out.println("The " + firstParty + " party got " + firstPartyPercent + " percent of the vote");

        // display second party percent of votes
        System.out.println("The " + secondParty + " party got " + secondPartyPercent + " percent of the vote");

        // display first party percent of votes
        System.out.println("The " + thirdParty + " party got " + thirdPartyPercent + " percent of the vote");
    }
}