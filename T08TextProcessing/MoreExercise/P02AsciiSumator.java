package T08TextProcessing.MoreExercise;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().toCharArray()[0];
        char secondSymbol = scanner.nextLine().toCharArray()[0];
        String text = scanner.nextLine();;

        // 2. String processing
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar > firstSymbol && currentChar < secondSymbol) {
                sum += currentChar;
            }
        }

        // 3. Output printing:
        System.out.println(sum);
    }
}
