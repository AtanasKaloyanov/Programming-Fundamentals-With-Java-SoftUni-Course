package T05ListsArraysAdvanced.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = readArray(scanner);
        List<Integer> list2 = readArray(scanner);

        // 2. Adding the elements until the end of the smallest list
        List<Integer> resultList = new ArrayList<>();
        int cycleEnd = Math.min(list1.size(), list2.size());

        for (int i = 0; i < cycleEnd; i++) {
            int number1 = list1.get(i);
            int number2 = list2.get(i);
            resultList.add(number1);
            resultList.add(number2);
        }

        // 3. Adding of the last numbers
        if (list1.size() != list2.size()) {
            List<Integer> lastNumbers = getLastNumbers(list1, list2, cycleEnd);
            resultList.addAll(lastNumbers);
        }

        // 3. Output printing
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
    private static List<Integer> readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
    private static List<Integer> getLastNumbers(List<Integer> list1, List<Integer> list2, int cycleEnd) {
        List<Integer> lastNumbers = new ArrayList<>();
        if (list1.size() > list2.size()) {
            lastNumbers = list1.subList(cycleEnd, list1.size());
        } else {
            lastNumbers = list2.subList(cycleEnd, list2.size());
        }
        return lastNumbers;
    }
}

