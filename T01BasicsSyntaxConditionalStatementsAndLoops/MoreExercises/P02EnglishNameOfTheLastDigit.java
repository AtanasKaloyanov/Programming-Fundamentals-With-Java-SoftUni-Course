package T01BasicsSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;


public class P02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // 2. Last digit getting and converting it to String
        int lastDigit = number % 10;
        String lastDigitString = getString(lastDigit);

        // 3. Output printing
        System.out.println(lastDigitString);
    }

    private static String getString(int number) {
        String result = null;
        switch (number) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
        }
        return result;
    }
}
