package T03Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Name reading and sum calculating for every name.
        // Then printing the name and the sum.
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            String currentName = scanner.nextLine();
            int currentSum = 0;
            for (int j = 0; j < currentName.length(); j++) {
                char currentChar = currentName.charAt(j);
                int currentPoints;
                if (isVowel(currentChar)) {
                    currentPoints = currentChar * currentName.length();
                } else {
                    currentPoints = currentChar / currentName.length();
                }

                currentSum += currentPoints;
            }
            array[i] = currentSum;
        }

        // 3. Sorting the array printing the array
        Arrays.sort(array);
        for (int current : array) {
            System.out.println(current);
        }
    }

    private static boolean isVowel(char currentChar) {
        return currentChar == 65 || currentChar == 69
                || currentChar == 73 || currentChar == 79 || currentChar == 85
                || currentChar == 97 || currentChar == 101 || currentChar == 105
                || currentChar == 111 || currentChar == 117;
        // 97, 101, 105, 111, and 117
        // 65, 69, 73, 79, and 85
    }
}
