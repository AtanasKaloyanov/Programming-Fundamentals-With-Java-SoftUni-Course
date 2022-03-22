package T03Arrays.Lists.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read n numbers and print them in reverse order.

        int givenNumber = Integer.parseInt(scanner.nextLine());

        int[] numberArray = new int[givenNumber];

        for (int i = 0; i < numberArray.length; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());
            numberArray[i] = currentNumber;

        }

        for (int i = numberArray.length - 1; i >= 0  ; i--) {

            System.out.print(numberArray[i] + " ");
        }

    }
}


