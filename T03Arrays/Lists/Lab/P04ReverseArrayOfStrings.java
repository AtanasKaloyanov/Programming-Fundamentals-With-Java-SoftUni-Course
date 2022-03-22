package T03Arrays.Lists.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to read an array of strings, reverse it and print its elements.
        // The input consists of a sequence of space-separated strings. Print the output on a single line (space separated).


        String[] stringArray = scanner.nextLine().split(" ");

        for (int i = 0; i < stringArray.length / 2 ; i++) {

            String currentString = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - 1 - i];

            stringArray[stringArray.length - 1 - i] = currentString;



        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
    }
}
