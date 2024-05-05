package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P10MultiplicationTable2 {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int begin = Integer.parseInt(scanner.nextLine());

        // 2. Output printing - 2 cases:
        if (begin > 10) {
            int sum = number * begin;
            System.out.printf("%d X %d = %d", number, begin, sum);
        } else {
            for (int i = begin; i <= 10; i++) {
                int sum = number * i;
                System.out.printf("%d X %d = %d\n", number, i, sum);
            }
        }

    }
}
