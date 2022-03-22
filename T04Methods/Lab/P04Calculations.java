package T04Methods.Lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                addition(firstNumber, secondNumber);
                break;
            case "subtract":
                subtraction(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplication(firstNumber, secondNumber);
                break;
            case "divide":
                devision(firstNumber, secondNumber);
                break;
        }
    }

    public static void addition(int firstNumber, int secondNumber) {
        double result = firstNumber + secondNumber;
        System.out.printf("%.0f", result);
    }

    public static void subtraction(int firstNumber, int secondNumber) {
        double result = firstNumber - secondNumber;
        System.out.printf("%.0f", result);
    }

    public static void multiplication(int firstNumber, int secondNumber) {
        double result = firstNumber * secondNumber;
        System.out.printf("%.0f", result);
    }

    public static void devision(int firstNumber, int secondNumber) {
        double result = firstNumber * 1.0 / secondNumber;
        System.out.printf("%.0f", result);
    }


}
