package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String currentWord : wordsArray) {
            char firstLetter = currentWord.charAt(0);
            char lastLetter = currentWord.charAt(currentWord.length() - 1);
            double number = Integer.parseInt(currentWord.substring(1, currentWord.length() - 1));

            int firstLetterPosition = Character.toLowerCase(firstLetter) - 96;
            int lastLetterPosition = Character.toLowerCase(lastLetter)- 64;

            if (Character.isUpperCase(firstLetter)) {
                double division = number / firstLetterPosition;
                sum += division;
            } else {
                double multiplication = number * firstLetterPosition;
                sum += multiplication;
            }

            if (Character.isUpperCase(lastLetter)) {
                sum -= lastLetterPosition;
            } else {
                sum += lastLetterPosition;
            }

        }
        System.out.printf("%.2f", sum);
    }
}
// A12b s17G

        // A12b                                           s17G

        // number firstChar place  lastChar  place        number firstChar place  lastChar  place
        //   12       A /     1       b +      2            17       s *    19       G -      7

        //  12 / 1 + 2 = 14                                 17 * 19 = 323 - 7 = 316
                            // 14 + 316 = 330

