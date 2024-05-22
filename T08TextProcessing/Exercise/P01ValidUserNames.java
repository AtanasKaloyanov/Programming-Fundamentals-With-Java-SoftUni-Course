package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P01ValidUserNames {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Printing all valid words
        String[] words = input.split(", ");
        for (String word : words) {
            boolean isValid = true;
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (Character.isLetter(currentChar) || Character.isDigit(currentChar) || currentChar == '-' || currentChar == '_') {
                } else {
                    isValid = false;
                    break;
                }
            }

            if ( (word.length() >= 3) && (word.length() <= 16) && isValid) {
                System.out.println(word);
            }
        }
    }
}
