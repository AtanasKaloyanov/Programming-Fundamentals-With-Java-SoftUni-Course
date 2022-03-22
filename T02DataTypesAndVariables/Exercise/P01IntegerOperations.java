package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read four integer numbers. Add first to the second, divide (integer) the sum by the third number,
        // and multiply the result by the fourth number. Print the result.

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        double result = ((firstNumber + secondNumber * 1.00) / thirdNumber) * fourthNumber;
        System.out.printf("%.0f", result);

    }
}
