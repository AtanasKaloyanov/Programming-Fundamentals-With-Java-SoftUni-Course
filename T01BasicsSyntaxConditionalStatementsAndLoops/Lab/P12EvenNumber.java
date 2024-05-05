package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. While cycle for odd numbers
        while (number % 2 != 0) {
            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }

        // 3. Printing the absolute value of the even number
        number = Math.abs(number);
        System.out.printf("The number is: %d", number);
    }
}

