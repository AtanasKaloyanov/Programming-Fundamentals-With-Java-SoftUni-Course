package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output reading via for cycle - 2 cases:
        for (int i = 1; i <= n; i++) {
            String currentDigitText = String.valueOf(i);
            int digitsSum = 0;
            for (int j = 0; j < currentDigitText.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(currentDigitText.charAt(j)));
                digitsSum += currentDigit;
            }
            if (digitsSum == 5 || digitsSum == 7 || digitsSum == 11) {
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}


