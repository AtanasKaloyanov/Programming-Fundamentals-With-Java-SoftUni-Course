package T04Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        subtract(firstNumber, secondNumber, thirdNumber);
    }

    public static int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void subtract(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.println(addition(firstNumber, secondNumber) - thirdNumber);
    }
}

