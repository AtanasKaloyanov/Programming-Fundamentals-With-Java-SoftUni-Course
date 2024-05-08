package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] array = readArray(scanner);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Array rotation via 2 nested loops
        for (int i = 0; i < n; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }

        // 3. Output printing
        System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));
    }
    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}














