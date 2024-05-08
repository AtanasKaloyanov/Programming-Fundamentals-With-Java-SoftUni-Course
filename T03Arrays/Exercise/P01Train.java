package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Array filling via for cycle
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            array[i] = currentNumber;
        }

        // 3. Output printing
        String firstLine = Arrays.toString(array).replaceAll("[\\[\\],]", "");
        System.out.println(firstLine);
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }
}
