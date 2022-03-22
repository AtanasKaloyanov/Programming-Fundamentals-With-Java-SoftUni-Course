package T08TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
              digits.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                letters.append(currentChar);
            } else {
                chars.append(currentChar);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(chars);

    }
}

