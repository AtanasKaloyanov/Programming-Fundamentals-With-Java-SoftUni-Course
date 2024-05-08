package T03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubstraction {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 2. Odd sum and Even sum computation
        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        // 3. Difference calculating and output printing
        int output = evenSum - oddSum;
        System.out.println(output);

    }
}
