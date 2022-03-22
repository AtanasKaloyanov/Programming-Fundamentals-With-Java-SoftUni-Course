package T04Methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Math.abs(Integer.parseInt(scanner.nextLine()));

        //System.out.println(evenSum(givenNumber) * oddSum(givenNumber));

        System.out.println(finalSum(givenNumber));

    }

    public static int oddSum (int givenNumber) {
        String intToString = Integer.toString(givenNumber);
        int[] oddArray = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        for (int i = 0; i <= oddArray.length - 1 ; i++) {
          int currentElement = oddArray[i];
          if (currentElement % 2 != 0) {
              evenSum += currentElement;
          }
        }
return evenSum;
    }

    public static int evenSum (int givenNumber) {
        String intToString = Integer.toString(givenNumber);
        int[] evenArray = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        for (int i = 0; i <= evenArray.length - 1 ; i++) {
            int currentElement = evenArray[i];
            if (currentElement % 2 == 0) {
                evenSum += currentElement;
            }
        }
        return evenSum;
    }

public static int finalSum(int sum ) {
        int evenSum = evenSum(sum);
        int oddSum = oddSum(sum);
        return evenSum(sum) * oddSum(sum);
}


}
