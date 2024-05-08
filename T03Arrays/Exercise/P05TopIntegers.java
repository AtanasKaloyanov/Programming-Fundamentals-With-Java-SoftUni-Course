package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] array = readArray(scanner);

        // 2. Finding the numbers that fit the conditions via 2 nested loops
        for (int i = 0; i < array.length; i++) {
            int currentInt = array[i];
            boolean isTop = isTop(array, i, currentInt);
            if (isTop) {
                System.out.print(currentInt + " ");
            }
        }
    }
    private static boolean isTop(int[] array, int i, int currentInt) {
        boolean isTop = true;
        for (int j = i + 1; j < array.length; j++) {
            int nextInt = array[j];
            if (currentInt <= nextInt) {
                isTop = false;
                break;
            }
        }
        return isTop;
    }
    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
