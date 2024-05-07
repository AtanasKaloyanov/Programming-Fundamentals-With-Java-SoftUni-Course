package T02DataTypesAndVariables.MoreExercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        BigDecimal firstNum = new BigDecimal(scanner.nextLine());
        BigDecimal secondNum = new BigDecimal(scanner.nextLine());

        // 2. Difference calculating
        BigDecimal diff = (firstNum.subtract(secondNum.abs())).abs();

        // 3. Output printing - 2 cases:
        BigDecimal precision = new BigDecimal("0.000001");
        if (diff.compareTo(precision) >= 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
