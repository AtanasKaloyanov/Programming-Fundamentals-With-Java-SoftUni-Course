package T05ListsArraysAdvanced.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // 2. Extracting the numbers and the other chars
        List<Integer> numbers = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isDigit(currentChar)) {
                int number = Integer.parseInt(String.valueOf(currentChar));
                numbers.add(number);
            } else {
                sb.append(currentChar);
            }
        }

        // 3. String manipulation - 2 cases:
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            currentNumber = getCurrentNumber(sb, currentNumber);

            if (i % 2 == 0) {
               String currentText = sb.substring(0, currentNumber);
               sb.replace(0, currentNumber, "");
               result.append(currentText);
            } else {
                sb.replace(0, currentNumber, "");
            }

            if (sb.isEmpty()) {
                break;
            }
        }

        // 4. Output printing
        System.out.println(result);

    }

    private static int getCurrentNumber(StringBuilder sb, int currentNumber) {
        if (currentNumber >= sb.length()) {
           currentNumber = sb.length();
        }
        return currentNumber;
    }
}
