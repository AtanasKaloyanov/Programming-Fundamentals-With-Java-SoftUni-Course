package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s++");

        // 2. Sum calculation
        double sum = 0;
        for (String text : array) {
            // 2.1. The number between the letter as StringBuilder assignment
            // and then parsing it to long
            String numberText = text.substring(1, text.length() - 1);
            long number = Long.parseLong(numberText);

            // 2.2. First letter calculations
            char firstLetter = text.charAt(0);
            int alphPosition = Character.toLowerCase(firstLetter) - 96;
            double currentResult;
            if (Character.isUpperCase(firstLetter)) {
                currentResult = number * 1.0 / alphPosition;
            } else {
                currentResult = number * alphPosition;
            }

            // 2.3. Last letter calculations
            char lastLetter = text.charAt(text.length() - 1);
            alphPosition = Character.toLowerCase(lastLetter) - 96;
            if (Character.isUpperCase(lastLetter)) {
                currentResult -= alphPosition;
            } else {
                currentResult += alphPosition;
            }

            sum += currentResult;
        }

        // 3. Output printing
        System.out.printf("%.2f", sum);
    }
}


