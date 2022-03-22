package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P02SumDigitsSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will be given a single integer. Your task is to find the sum of its digits.

        int number = Integer.parseInt(scanner.nextLine());
        String stringNumber = "" + number;
        int sum = 0;

        for (int i = 0; i <= stringNumber.length() - 1 ; i++) {
            int currentNumber = Integer.parseInt("" + stringNumber.charAt(i));
            sum = currentNumber + sum;
        }
        System.out.println(sum);
    }
}
