package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] array = readArray(scanner);

        // 2. Finding the longest sequence of elements via 2 counters,
        // 2 temps and a for cycle
        int previousElement = array[0];
        int currentCount = 1;
        int maxElement = array[0];
        int maxCount = 1;

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            if (currentElement == previousElement) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxElement = currentElement;
                }
            } else {
                currentCount = 1;
                previousElement = currentElement;
            }
        }

        // 3. Output printing
        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxElement + " ");
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}




