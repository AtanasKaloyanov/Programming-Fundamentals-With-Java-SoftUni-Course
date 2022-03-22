package T03Arrays.Lists.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read two arrays and print on the console whether they are identical or not.
        // Arrays are identical if their elements are equal.
        // If the arrays are identical find the sum of the first one and print on the console the following message:
        // "Arrays are identical. Sum: {sum}",
        // otherwise find the first index where the arrays differ and print on the console following message:
        // "Arrays are not identical. Found difference at {index} index."
        
        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isNotEqual = false;
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
               int currentElement = firstArray[i];
               int currentElement2 = secondArray[i];

               if (currentElement != currentElement2) {
                   isNotEqual = true;
                   System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                   break;
               }
               sum += currentElement;
        }
if (!isNotEqual) {
    System.out.printf("Arrays are identical. Sum: %d", sum);
}

    }
}
