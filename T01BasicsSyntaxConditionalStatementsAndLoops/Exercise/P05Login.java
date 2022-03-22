package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//You will be given a string representing a username.
// The password will be that username reversed. Until you receive the correct password print on the console "Incorrect password.
// Try again.".
//When you receive the correct password print "User {username} logged in."
// However on the fourth try if the password is still not correct print "User {username} blocked!" and end the program.

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() - 1; position >= 0; position--) {

            char currentSymbol = username.charAt(position);
            password = password + currentSymbol;
        }

         String input = scanner.nextLine();

        int counter = 0;
        while (!input.equals(password)) {

            counter++;
            if (counter == 4) {
                break;
            }
            System.out.println("Incorrect password. Try again.");

            input = scanner.nextLine();
        }
if (input.equals(password)) {
    System.out.printf("User %s logged in.", username);
} else {
    System.out.printf("User %s blocked!", username);
}
    }
}
