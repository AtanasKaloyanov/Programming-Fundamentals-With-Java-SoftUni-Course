package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] array = readArray(scanner);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. Finding the sum of the current and next element and if the sum is equal to the
        // given number than printing
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int nextElement = array[j];
                int sum = currentElement + nextElement;
                if (sum == number) {
                    System.out.printf("%d %d\n", currentElement, nextElement);
                }
            }

        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

