package T04Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case '+':
                System.out.println( resultAddition(firstNumber, secondNumber));
                break;
            case '-':
                System.out.println( resultSubtract(firstNumber, secondNumber));
                break;
            case '*':
                System.out.println(resultMultiplication(firstNumber, secondNumber));
                break;
            case '/':
                DecimalFormat df = new DecimalFormat("0.##########");
                System.out.println(df.format(resultDivision(firstNumber, secondNumber)));
                break;
        }
    }


    public static int resultAddition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int resultSubtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int resultMultiplication(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static double resultDivision(int firstNum, int secondNum) {
        return firstNum * 1.00 / secondNum;
    }
}
