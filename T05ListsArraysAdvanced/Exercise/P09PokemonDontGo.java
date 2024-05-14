package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = readList(scanner);

        // 2. 3 cases of removing and / or adding, then sum calculation.
        int sum = 0;
        while (!list.isEmpty()) {
            int currentIndex = Integer.parseInt(scanner.nextLine());
            int removedNumber;

            if (currentIndex < 0) {
                removedNumber = list.remove(0);
                int lastNumber = list.get(list.size() - 1);
                list.add(0, lastNumber);
            } else if (currentIndex >= list.size()) {
                removedNumber = list.remove(list.size() - 1);
                int firstNumber = list.get(0);
                list.add(firstNumber);
            } else {
                removedNumber = list.remove(currentIndex);
            }

            sum = getSum(list, sum, removedNumber);
        }

        System.out.println(sum);
    }

    private static int getSum(List<Integer> list, int sum, int removedNumber) {
        sum += removedNumber;
        for (int i = 0; i < list.size(); i++) {
            int currentNumber = list.get(i);
            if (currentNumber <= removedNumber) {
                list.set(i, currentNumber + removedNumber);
            } else {
                list.set(i, currentNumber - removedNumber);
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
