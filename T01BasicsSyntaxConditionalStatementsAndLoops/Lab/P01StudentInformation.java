package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        // 2. Output printing
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
