package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] array = readArray(scanner);

        // 2. Finding index
        int index = -1;
        boolean hasSpecialElement = false;
        for (int i = 0; i < array.length; i++) {
            // 2.1. Left sum computation
            int leftSum = getLeftSum(array, i);

            // 2.2. Right sum computation
            int rightSum = getRightSum(array, i);

            // 2.3. Check if the element is equal to the left and rght sum
            if (leftSum == rightSum) {
                hasSpecialElement = true;
                index = i;
                break;
            }
        }

        // 3. Output - 2 cases:
        if (hasSpecialElement) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }

    }
    private static int getLeftSum(int[] array, int i) {
        int leftSum = 0;
        for (int j = i - 1; j >= 0 ; j--) {
            int currentLeftElement = array[j];
            leftSum += currentLeftElement;
        }
        return leftSum;
    }

    private static int getRightSum(int[] array, int i) {
        int rightSum = 0;
        for (int j = i + 1; j < array.length; j++) {
            int currentRightElement = array[j];
            rightSum += currentRightElement;
        }
        return rightSum;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
