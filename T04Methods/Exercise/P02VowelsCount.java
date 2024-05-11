package T04Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Vowels counting and printing
        int vowelCounter = vowelCounting(input);
        System.out.println(vowelCounter);
    }

    private static int vowelCounting(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = Character.toLowerCase(input.charAt(i));
            if (isVowel(currentChar)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isVowel(char currentChar) {
        return currentChar == 'a'
                || currentChar == 'e' || currentChar == 'i'
                || currentChar == 'o' || currentChar == 'u';
    }
}
