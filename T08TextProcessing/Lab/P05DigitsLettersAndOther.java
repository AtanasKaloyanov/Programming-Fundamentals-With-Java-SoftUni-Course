package T08TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2.
        StringBuilder output1 = new StringBuilder();
        StringBuilder output2 = new StringBuilder();
        StringBuilder output3 = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                output1.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                output2.append(currentChar);
            } else {
                output3.append(currentChar);
            }
        }

        // 3. Output printing
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }
}

