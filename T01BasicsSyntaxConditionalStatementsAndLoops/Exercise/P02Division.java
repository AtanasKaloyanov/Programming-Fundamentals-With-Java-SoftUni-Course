package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int devidedNumber = 0;
        int minimal = Integer.MAX_VALUE;

        if (number % 10 == 0) {
            devidedNumber = number / 10;
            if (devidedNumber < minimal) {
                minimal = devidedNumber;
                System.out.println("The number is divisible by 10");
            }
        }
        else if (number % 7 == 0) {
            devidedNumber = number / 7;
            if (devidedNumber < minimal) {
                minimal = devidedNumber;
                System.out.println("The number is divisible by 7");
            }
        }
        else if (number % 6 == 0) {
            devidedNumber = number / 6;
            if (devidedNumber < minimal) {
                minimal = devidedNumber;
                System.out.println("The number is divisible by 6");
            }
        }
       else if (number % 3 == 0) {
            devidedNumber = number / 3;
            if (devidedNumber < minimal) {
                minimal = devidedNumber;
                System.out.println("The number is divisible by 3");
            }
        }
        else if (number % 2 == 0) {
            devidedNumber = number / 2;
            if (devidedNumber < minimal) {
                minimal = devidedNumber;
                System.out.println("The number is divisible by 2");
            }
        }

        else   {
            System.out.println("Not divisible");
        }

    }
}
