package T02DataTypesAndVariables.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Finding and printing of the sum
        for (int i = 0; i < n; i++) {
            long[] array = getArray(scanner);

            long num1 = array[0];
            long num2 = array[1];

            int sum;
            if (num1 > num2) {
                sum = getSum(num1);
            } else {
                sum = getSum(num2);
            }

            System.out.println(sum);
        }
    }

    private static int getSum(long num) {
        int sum = 0;
        String numberAsString = String.valueOf(num);
        for (int j = 0; j < numberAsString.length(); j++) {
            char currentChar = numberAsString.charAt(j);
            if (currentChar == '-') {
                continue;
            }
            int currentDigit = Integer.parseInt(String.valueOf(currentChar));
            sum += currentDigit;
        }
        return sum;
    }

    private static long[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
    }
}
