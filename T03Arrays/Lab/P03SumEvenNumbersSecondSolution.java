package T03Arrays.Lists.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbersSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read an array from the console and sum only the even numbers.

        int[] numberArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {

            int currentNumber = numberArray[i];
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }
        }

        System.out.println(sum);
    }
}
