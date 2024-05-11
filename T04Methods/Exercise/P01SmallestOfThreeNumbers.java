package T04Methods.Exercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        // 2. Finding the greatest number
        int greatestNumber = getMin(number1, number2, number3);
        System.out.println(greatestNumber);
    }

    private static int getMin(int number1, int number2, int number3) {
        return Math.min(Math.min(number1, number2), number3);
    }
}
