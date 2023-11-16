/**
 * Filename CommentsDialog.java
 *
 * Coded by Emanuel Ramos
 * 11/2/2023
 *
 * Programming Exercise 1-11
 *
 * // this is the original code provided
 * class CommentsDialog
 * {
 *    public static void main(String[] args)
 *    {
 *       System.out.println("Program comments are nonexecuting statements ");
 *       System.out.println("you add to a file for documentation.");
 *       // three line comments
 *       // Program comments are nonexecuting statements
 *       // you add to a file for documentation.
 *       // one block comment
 *       /* Program comments are nonexecuting statements
 *        you add to a file for documentation. / // < add * before slash
 *       // one javadoc comment
 *       /** Program comments are nonexecuting statements
 *           you add to a file for documentation.  / // < add * before slash
 *     }
 * }
 *
 * Requirements:
 * Modify the Comments.java program
 * from Programming Exercise 1-10 so at
 * least one of the statements about
 * comments is displayed in a dialog box.
 */

// this is the start of my code
import javax.swing.JOptionPane;
class CommentsDialog {
    public static void main(String[] args) {
        System.out.println("Program comments are nonexecuting statements ");
        System.out.println("you add to a file for documentation.");
        // three line comments
        // Program comments are nonexecuting statements
        // you add to a file for documentation.
        // one block comment
      /* Program comments are nonexecuting statements
         you add to a file for documentation. */
        // one javadoc comment
        /** Program comments are nonexecuting statements
         you add to a file for documentation.  */
        // call function to display pop-up with message and title
        infoBox("Program comments are nonexecuting statements", "Message");
    }

    // create a function to display a pop-up with a title bar and some text
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}