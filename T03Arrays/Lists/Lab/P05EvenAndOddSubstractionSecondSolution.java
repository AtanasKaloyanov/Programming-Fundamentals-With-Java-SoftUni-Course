package T03Arrays.Lists.Lab;

import java.util.Scanner;

public class P05EvenAndOddSubstractionSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.

        String stringNumbers = scanner.nextLine();
        String[] stringArray = stringNumbers.split(" ");

        int[] numberArray = new int [stringArray.length];


        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = Integer.parseInt(stringArray[i]);

            int currentElement = numberArray[i];
            if (currentElement % 2 == 0) {
                evenSum += currentElement;
            } else {
                oddSum += currentElement;
            }

        }
        System.out.println(evenSum - oddSum);



    }
}
