package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P01Ages {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        // 2. Output assignment
        String output = null;
        if (age <= 2) {
            output = "baby";
        } else if (age <= 13) {
            output = "child";
        } else if (age <= 19) {
            output = "teenager";
        } else if (age <= 65) {
            output = "adult";
        } else {
            output = "elder";
        }

        // 3. Output printing
        System.out.println(output);
    }
}
