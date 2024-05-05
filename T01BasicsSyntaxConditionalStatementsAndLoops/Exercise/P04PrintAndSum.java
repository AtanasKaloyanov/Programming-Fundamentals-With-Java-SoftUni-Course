package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        // 2. Sum computation
        int sum = 0;
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        // 3. Output printing
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
