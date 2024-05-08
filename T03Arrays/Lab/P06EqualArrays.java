package T03Arrays.Lists.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = getArray(scanner);
        int[] numbers2 = getArray(scanner);

        // 2. Finding if the array are equals via boolean variable
        int sum = 0;
        for (int i = 0; i < numbers1.length; i++) {
            int currentElementArray1 = numbers1[i];
            int currentElementArray2 = numbers2[i];

            if (currentElementArray1 != currentElementArray2) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            }

            sum += currentElementArray1;
        }

        // 3. Output printing
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}