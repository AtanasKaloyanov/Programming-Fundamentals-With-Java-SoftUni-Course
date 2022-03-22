package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to check if a given number is a strong number or not.
        // A number is strong if the sum of the Factorial of each digit is equal to the number.
        // For example 145 is a strong number, because 1! + 4! + 5! = 145.
        // Print "yes" if the number is strong and "no" if the number is not strong.

        int givenNumber = Integer.parseInt(scanner.nextLine());
        String stringNumber = "" + givenNumber;

        int sumFactorial = 0;

        for (int i = 0; i <= stringNumber.length() - 1; i++) {
            int currentNumber = Integer.parseInt("" + stringNumber.charAt(i));

            int factorial = 1;

            for (int j = 1; j <= currentNumber; j++) {
                factorial = factorial * j;
            }
            sumFactorial = sumFactorial + factorial;
        }
        if (sumFactorial == givenNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}



