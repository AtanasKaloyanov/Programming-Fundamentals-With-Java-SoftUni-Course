package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZizZagArrays {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Creating 2 arrays and filling them
        int[] output1 = new int[n];
        int[] output2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] currentArray = createArray(scanner);
            int element1 = currentArray[0];
            int element2 = currentArray[1];
            if (i % 2 == 0) {
                output1[i] = element1;
                output2[i] = element2;
            } else {
                output1[i] = element2;
                output2[i] = element1;
            }
        }

        System.out.println(getOutputFormat(output1));
        System.out.println(getOutputFormat(output2));
    }

    private static String getOutputFormat(int[] output1) {
        return Arrays.toString(output1).replaceAll("[\\[\\],]", "");
    }

    private static int[] createArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}


