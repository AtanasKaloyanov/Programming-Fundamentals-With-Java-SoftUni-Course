package T04Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        division(firstNumber, secondNumber);

    }

    public static double firstFactorial(int firstNumber) {

        double factorial = 1;
        for (int i = 1; i <= firstNumber ; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static double secondFactorial(int secondNumber) {

        double factorial = 1;
        for (int i = 1; i <= secondNumber ; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void division(int firstNumber, int secondNumber) {
        double division = firstFactorial(firstNumber) / secondFactorial(secondNumber);
        System.out.printf("%.2f", division);
    }

}
