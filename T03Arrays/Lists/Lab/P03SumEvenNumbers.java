package T03Arrays.Lists.Lab;

import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read an array from the console and sum only the even numbers.

        String input = scanner.nextLine();
        String[] stringArray = input. split(" ");
        int[] numberArray = new int[stringArray.length];

        int sum = 0;

        for (int i = 0; i < numberArray.length ; i++) {
            numberArray[i] = Integer.parseInt(stringArray[i]);

            int currentNumber = numberArray[i];
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }
        }
        System.out.println(sum);
    }
}
