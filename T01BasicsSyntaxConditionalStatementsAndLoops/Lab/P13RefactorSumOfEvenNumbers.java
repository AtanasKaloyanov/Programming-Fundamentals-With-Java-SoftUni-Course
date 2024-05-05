package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P13RefactorSumOfEvenNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. End and sum computation via for cycle
        int end = n * 2;
        int sum = 0;
        for (int i = 1; i < end; i += 2) {
            sum += i;
            System.out.println(i);
        }

        // 3. Sum printing
        System.out.printf("Sum: %d", sum);
    }
}
