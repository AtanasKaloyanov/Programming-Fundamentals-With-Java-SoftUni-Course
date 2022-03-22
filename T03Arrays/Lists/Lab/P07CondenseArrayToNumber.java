package T03Arrays.Lists.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to read an array of integers and condense them by summing adjacent couples of elements until a single integer is obtained.
        // For example, if we have 3 elements {2, 10, 3}, we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
        // then we sum again all adjacent elements and obtain {12+13} = {25}.

        String givenString = scanner.nextLine();
        String[] stringArray = givenString.split(" ");
        int[] firstArray = new int[stringArray.length];

        for (int i = 0; i < firstArray.length; i++) {

            firstArray[i] = Integer.parseInt(stringArray[i]);

        }

        while (firstArray.length > 1) {

            int[] secondArray = new int[firstArray.length - 1];

            for (int i = 0; i < secondArray.length; i++) {

                secondArray[i] = firstArray[i] + firstArray[i + 1];

            }
            firstArray = secondArray;
        }

        System.out.println(firstArray[0]);
        
        }
    }

