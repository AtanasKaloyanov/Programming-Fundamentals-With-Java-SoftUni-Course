package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program, which sums the ASCII codes of n characters. Print the sum on the console

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n ; i++) {

            char currentChar = scanner.nextLine().charAt(0);
            String stringChar = "" + currentChar;
            int currentNumber = stringChar.charAt(0);
            sum += currentNumber;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
