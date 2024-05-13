package T05ListsArraysAdvanced.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = createList(scanner);

        // 2. Summing and adding in for cycle until the middle element
        List<Integer> result = new ArrayList<>();
        int middleIndex = list.size() / 2;
        for (int i = 0; i < middleIndex; i++) {
            int currentNumber = list.get(i);
            int lastNumber = list.get(list.size() - 1 - i);
            int sum = currentNumber + lastNumber;
            result.add(sum);
        }

        if (list.size() % 2 == 1) {
            int middleElement = list.get(middleIndex);
            result.add(middleElement);
        }

        // 3. Result printing
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
    private static List<Integer> createList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
    }
}
