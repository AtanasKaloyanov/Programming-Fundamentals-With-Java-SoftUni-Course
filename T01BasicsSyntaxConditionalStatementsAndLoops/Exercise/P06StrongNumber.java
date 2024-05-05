package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. Factorial computation
        String stringNumber = String.valueOf(number);
        int end = stringNumber.length();

        int factSum = 0;
        for (int i = 0; i < end; i++) {
            char currentChar = stringNumber.charAt(i);
            int currenCharNumber = Integer.parseInt(String.valueOf(currentChar));

            int currentFact = factorial(currenCharNumber);
            factSum += currentFact;
        }

        // 3. Output printing
        if (factSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    private static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int fact = 1;
        for (int i = number; i >= 2; i--) {
            fact *= i;
        }
        return fact;
    }
}



