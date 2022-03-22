package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        if (times > 10 ) {
            sum = n * times;
            System.out.printf("%d X %d = %d", n, times, sum);
        }

        for (int i = times; i <= 10; i++) {

            sum = i * n;

            System.out.printf("%d X %d = %d%n", n, i, sum);

        }
    }
}
