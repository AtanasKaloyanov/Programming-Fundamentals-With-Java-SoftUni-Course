package T04Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Input length check
        int inputLength = input.length();
        if (inputLength < 6 || inputLength > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        // 3. Chars check
        boolean hasOnlyDiditsAndLetters = true;
        int digitsCounter = 0;
        for (int i = 0; i < inputLength; i++) {
            char currentChar = input.charAt(i);
            boolean cond1 = Character.isDigit(currentChar);
            boolean cond2 = Character.isLetter(currentChar);

            if (!cond1 && !cond2) {
                hasOnlyDiditsAndLetters = false;
            }
            if (cond1) {
                digitsCounter++;
            }

        }

        // 4. Output printing
        if (!hasOnlyDiditsAndLetters) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (digitsCounter < 2) {
            System.out.println("Password must have at least 2 digits");
        }

        if (hasOnlyDiditsAndLetters && digitsCounter >= 2) {
            System.out.println("Password is valid");
        }
    }
}
