package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via for cycle
        int sum = 0;

        for (int ch = 1; ch <= n; ch++) {
            int currentNumber = ch;
            while (ch > 0) {
                sum += ch % 10;
                ch = ch / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            String message = Character.toUpperCase(String.valueOf(isSpecial).charAt(0))
                    + String.valueOf(isSpecial).substring(1);
            System.out.printf("%d -> %s%n", currentNumber, message);
            sum = 0;
            ch = currentNumber;
        }

    }
}

