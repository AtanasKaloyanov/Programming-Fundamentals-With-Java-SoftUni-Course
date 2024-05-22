package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingCharsSecondSolution {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        // 2. String processing
        for (int i = sb.length() - 1; i >= 1; i--) {
            char currentDigit = sb.charAt(i);
            char nextDigit = sb.charAt(i - 1);
            if (currentDigit == nextDigit) {
                sb.deleteCharAt(i);
            }
        }

        // 3. Output printing
        System.out.println(sb);
    }
}
