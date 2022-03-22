package T03Arrays.Lists.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.

        int[] numberArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numberArray.length; i++) {

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
