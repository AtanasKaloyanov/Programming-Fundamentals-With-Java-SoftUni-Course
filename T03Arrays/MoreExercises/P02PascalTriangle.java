package T03Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Printing n rows. Every element from the row (except the last one) is equal to the sum of the element of the same
        // index and the element of the previous index of the previous row. If the index is -1 the element of the previous position is 0.
        // The last element of the current row is 1.
        // In the end the new row is printed

        int[] previousArray = {1};
        for (int i = 1; i <= n; i++) {
            int[] currentArray = new int[i];
            for (int j = 0; j < i - 1; j++) {
                int previousElement = 0;
                if (j - 1 != -1) {
                    previousElement = previousArray[j - 1];
                }
                currentArray[j] = previousElement + previousArray[j];
            }
            currentArray[i - 1] = 1;
            System.out.println(Arrays.toString(currentArray).replaceAll("[\\[\\],]", ""));
            previousArray = currentArray;
        }
    }
}
