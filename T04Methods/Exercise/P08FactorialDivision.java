package T04Methods.Exercise;
import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        // 2. Factorial calculations
        long factorial1 = fact(number1);
        long factorial2 = fact(number2);

        // 3. Result division and printing
        double result = factorial1 * 1.0 / factorial2;
        System.out.printf("%.2f", result);
    }

    private static long fact(int number) {
        long result = 1;
        for (int i = number; i >= 2; i--) {
            result *= i;
        }
        return result;
    }
}
