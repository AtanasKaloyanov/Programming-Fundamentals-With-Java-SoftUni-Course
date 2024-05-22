package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P02CharacterMultiplierSecondSolution {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        String word1 = array[0];
        String word2 = array[1];

        // 2. Cycle end finding and multiplying
        int sum = 0;
        int end = Math.min(word1.length(), word2.length());
        for (int i = 0; i < end; i++) {
            char currentChar1 = word1.charAt(i);
            char currentChar2 = word2.charAt(i);
            sum += currentChar1 * currentChar2;
        }

        // 3. Adding the remaining chars of the longer string
        if (word1.length() > word2.length()) {
            for (int i = end; i < word1.length(); i++) {
                sum += word1.charAt(i);
            }
        } else {
            for (int i = end; i < word2.length(); i++) {
                sum += word2.charAt(i);
            }
        }

        // 4. Output printing
        System.out.println(sum);
    }
}
