package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P06StrongNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to check if a given number is a strong number or not.
        // A number is st475
        // rong if the sum of the Factorial of each digit is equal to the number.
        // For example 145 is a strong number, because 1! + 4! + 5! = 145.
        // Print "yes" if the number is strong and "no" if the number is not strong.

        int givenNumber = Integer.parseInt(scanner.nextLine());
        int finalNumber = givenNumber;

        int currentNumber = 0;
        int sumFactorial = 0;

        while (givenNumber != 0) {
             currentNumber = givenNumber % 10;

             int factorial = 1;

            for (int i = 1; i <= currentNumber ; i++) {
                factorial = factorial * i;
            }
             sumFactorial = sumFactorial + factorial;
            givenNumber = givenNumber / 10;
        }

        if (finalNumber == sumFactorial) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
