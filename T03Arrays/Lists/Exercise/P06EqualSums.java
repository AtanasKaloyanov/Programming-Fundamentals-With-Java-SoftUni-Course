package T03Arrays.Lists.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that determines if there exists an element in the array such that the sum of the elements
        // on its left is equal to the sum of the elements on its right.
        // If there are no elements to the left/right,
        // their sum is considered to be 0. Print the index that satisfies the required condition or "no" if there is no such index.

        int[] intArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;

        for (int index = 0; index <= intArray.length - 1 ; index++) {

            int currentElement = intArray[index];

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += intArray[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex <= intArray.length - 1 ; rightIndex++) {
                rightSum += intArray[rightIndex];
            }

            if (rightSum == leftSum) {
                System.out.println(index);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }

    }
}
