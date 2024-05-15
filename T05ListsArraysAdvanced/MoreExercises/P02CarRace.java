package T05ListsArraysAdvanced.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = readList(scanner);

        // 2. Middle index and sums calculations
        int middle = list.size() / 2;
        double sum1 =  calculateSum1(list, middle);
        double sum2 = calculateSum2(list, middle);

        // 3. Output printing
        String winner = sum1 < sum2 ? "left" : "right";
        double smallerSum = Math.min(sum1, sum2);
        System.out.printf("The winner is %s with total time: %.1f", winner, smallerSum);
    }

    private static double calculateSum2(List<Integer> list, int middle) {
        double sum = 0;
        for (int i = list.size() - 1; i > middle; i--) {
            int currentNumber = list.get(i);
            if (currentNumber == 0) {
                sum *= 0.80;
            } else {
                sum += currentNumber;
            }
        }
        return sum;
    }

    private static double calculateSum1(List<Integer> list, int middle) {
        double sum = 0;
        for (int i = 0; i < middle; i++) {
            int currentNumber = list.get(i);
            if (currentNumber == 0) {
                sum *= 0.80;
            } else {
                sum += currentNumber;
            }
        }
        return sum;
    }

    private static List<Integer> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
