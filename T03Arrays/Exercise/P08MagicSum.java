package T03Arrays.Lists.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program, which prints all unique pairs in an array of integers whose sum is equal to a given number.

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int givenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length - 1; i++) {

            int currenNumberI = array[i];

            for (int j = i + 1; j < array.length; j++) {

                int currentNumberJ = array[j];

                if (array[i] + array[j] == givenNumber) {
                    System.out.printf("%d %d%n", array[i], array[j]);
                }
            }

        }
//         1 7 6 2 19 23
    }
}

