package T03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 2. Even sum calculating
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }
        }

        // 3. Output printing
        System.out.println(sum);
    }
}
