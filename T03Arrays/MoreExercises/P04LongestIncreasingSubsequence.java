package T03Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] numbers = createArray(scanner);

        // 2. Creating an array that holds the lengths of the longest sequences and another with the indices of the last but one element of every sequence.
        // Then filling the first array with 1 (because firstly every separated number is a sequence of one element) and the second array with -1 (because -1 is a non-existent index)
        int[] longestSequencesLengths = new int[numbers.length];
        int[] lastButOneElementsIndices = new int[numbers.length];
        Arrays.fill(longestSequencesLengths, 1);
        Arrays.fill(lastButOneElementsIndices, -1);

        // Last index of the element of the longest sequence and the length of the longest sequence
        int lastIndex = -1;
        int longIncreasingSequenceLength = 0;

        // 3. Creating 2 nested loops. The first loop begins from the second number and ends to the last number.
        // The inner loop begins from the first number and ends to the number of the outer loop
        for (int i = 1; i < numbers.length; i++) {
            int compareNumber = numbers[i];
            for (int j = 0; j < i; j++) {
                int currentNumber = numbers[j];
                // 3.1 There are 2 conditions to find the length of the longest sequence:
                // 1. the current number should be smaller than the compare number because the sequence is increasing and
                // 2. the current sequence + 1 should be longer than the sequence of the compare number because
                // we need the sequence with the greatest length
                if ( (currentNumber < compareNumber) && (longestSequencesLengths[j] + 1 > longestSequencesLengths[i])) {
                    longestSequencesLengths[i] = longestSequencesLengths[j] + 1;

                    // 3.2. Then filling the second array with the last but one element of the sequence. This index is j.
                    lastButOneElementsIndices[i] = j;
                }

                // 3.3. Finding the last index of the element of the longest sequence and the
                //      length of the longest sequence for every iteration
                if (longestSequencesLengths[i] > longIncreasingSequenceLength) {
                    longIncreasingSequenceLength = longestSequencesLengths[i];
                    lastIndex = i;
                }
            }
        }

        // 4. Creating an output array and filling it via while cycle. When the last index reaches
        // -1 it means that there isn't previous element

        int[] result = new int[longIncreasingSequenceLength];
        int currentIndex = longIncreasingSequenceLength - 1;

        while (lastIndex != -1) {
            result[currentIndex] = numbers[lastIndex];
            currentIndex--;
            lastIndex = lastButOneElementsIndices[lastIndex];
        }

        // 5. Output printing
        System.out.println(Arrays.toString(result).replaceAll("[\\[\\],]", ""));
    }

    private static int[] createArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}

