package T04Methods.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04TribonacciSequenceRecc {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Finding the fibonacci number for every position of the cycle via recursion
        // and adding it to the result list. This algorithm is very slow.
        List<Long> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            long currentNumber = tribRecc(i);
            result.add(currentNumber);
        }

        // 3. Output printing
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
    private static long tribRecc(long n) {
        if (n == 3) {
            return 2;
        }
        if (n == 2 || n == 1) {
            return 1;
        }

        return tribRecc(n - 1) + tribRecc(n - 2) + tribRecc(n - 3);
    }
}
