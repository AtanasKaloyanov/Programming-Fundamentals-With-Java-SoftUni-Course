package T04Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        // 2. Calculations
        int sum = add(number1, number2);
        int difference = subtract(sum, number3);

        // 3. Output printing
        System.out.println(difference);
    }
    private static int add(int number1, int number2) {
        return number1 + number2;
    }
    private static int subtract(int number1, int number2) {
        return number1 - number2;
    }
}

