package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 2. Summarizing adjacent elements via nested cycles and temp array
        while (numbers.length != 1) {
            int[] tempArray = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                tempArray[i] = numbers[i] + numbers[i + 1];
            }
            numbers = tempArray;
        }

        // 3. Output printing
        System.out.println(numbers[0]);
    }
}

