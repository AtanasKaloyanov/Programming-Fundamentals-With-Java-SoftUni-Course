package T08TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        // 2. String processing
        StringBuilder sb = new StringBuilder();
        int remainder = 0;

        for (int i = firstNumber.length() - 1; i >= 0; i--) {
            char currentChar = firstNumber.charAt(i);
            int currentNumber = Integer.parseInt(String.valueOf(currentChar));

            int product = currentNumber * secondNumber + remainder;

            if (i == 0) {
                sb.insert(0, product);
            } else {
                int addedNumber = product % 10;
                sb.insert(0, addedNumber);
                remainder = product / 10;
            }
        }

        // 3. Output printing:
        while (sb.charAt(0) == '0' && sb.length() > 1) {
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
}


//9999 9
// 9 * 9 = 81 -->          1 / 8
// 9 * 9 = 81 -->  1 + 8 = 9 / 8
// 9 * 9 = 81 -->  1 + 8 = 9 / 8
// 9 * 9 = 81 -->  1 + 8 = 9 / 9
//                         8

//89991
