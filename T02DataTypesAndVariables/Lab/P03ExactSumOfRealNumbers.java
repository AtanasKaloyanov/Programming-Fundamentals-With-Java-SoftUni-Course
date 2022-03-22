package T02DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write program to enter n numbers and print their exact sum:

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {

            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);
        }

        System.out.println(sum);

    }
}
