package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P03PassedOrFailed {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        // 2. Output printing by condition
        if (grade >= 3) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
