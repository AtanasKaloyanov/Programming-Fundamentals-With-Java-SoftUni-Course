package T04Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        topNumberFinding(n);
    }

    public static boolean devisionBy8(int givenNumber) {

        String stringGivenNumber = Integer.toString(givenNumber);

        int[] array = Arrays
                .stream(stringGivenNumber.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            int currentElement = array[i];
            sum = sum + currentElement;
        }

        if (sum % 8 == 0) {
            return true;
        }
        return false;

    }

    public static boolean hasOddDigit(int givenNumber) {

        String currentString = Integer.toString(givenNumber);
        int[] array = Arrays
                .stream(currentString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int oddCounter = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            int currentElement = array[i];
            if (currentElement % 2 != 0) {
                oddCounter++;
            }
        }
        if (oddCounter > 0) {
            return true;
        }
        return false;
    }


    public static void topNumberFinding(int givenNumber) {


        for (int i = 0; i <= givenNumber; i++) {

            if (devisionBy8(i) && hasOddDigit(i)) {
                System.out.println(i);
            }
        }

    }
}

