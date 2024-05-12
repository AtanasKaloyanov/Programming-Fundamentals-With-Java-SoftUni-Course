package T04Methods.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04TribonacciSequenceIterative {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Input check,then creating an array and filling the starting elements
        if (n <= 0) {
            return;
        }

        long[] numbers = new long[n];
        fillingTheStartingNumbers(numbers, n);

        // 3. Iterative fibonacci algorithm
        for (int i = 3; i < n; i++) {
            int previousIndex = i - 1;
            int previousButOneIndex = i - 2;
            int previousButTwo = i - 3;

            long currentNumber = numbers[previousIndex] + numbers[previousButOneIndex] + numbers[previousButTwo];
            numbers[i] = currentNumber;
        }

        // 4. Output printing
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\],]", ""));
    }
    private static void fillingTheStartingNumbers(long[] numbers, int n) {
        if (n == 1) {
            numbers[0] = 1;
        } else if (n == 2) {
            numbers[0] = 1;
            numbers[1] = 1;
        } else {
            numbers[0] = 1;
            numbers[1] = 1;
            numbers[2] = 2;
        }
    }
}
