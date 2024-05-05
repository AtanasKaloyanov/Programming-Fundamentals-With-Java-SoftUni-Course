package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String account = scanner.nextLine();

        // 2. Reversing the input
        String password = new StringBuilder(account).reverse().toString();

        // 3. Output printing via for cycle
        for (int i = 0; i < 4; i++) {
            String currentInput = scanner.nextLine();
            if (currentInput.equals(password)) {
                System.out.printf("User %s logged in.", account);
                return;
            }
            if (i == 3) {
                System.out.printf("User %s blocked!", account);
                return;
            }
            System.out.println("Incorrect password. Try again.");
        }

    }
}
