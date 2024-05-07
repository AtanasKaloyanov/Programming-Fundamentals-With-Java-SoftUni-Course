package T02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via 2 nested for cycles
        for (int i = 2; i <= n ; i++) {
            int sqrt = (int) Math.sqrt(i);
            boolean isPrime = true;
            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}
