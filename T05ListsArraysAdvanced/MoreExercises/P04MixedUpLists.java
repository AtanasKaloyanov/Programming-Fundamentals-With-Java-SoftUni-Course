package T05ListsArraysAdvanced.MoreExercises;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = readList(scanner);
        List<Integer> list2 = readList(scanner);
        Collections.reverse(list2);

        // 2. End of the cycle defining and result list filling
        List<Integer> result = new ArrayList<>();
        int end = Math.min(list1.size(), list2.size());
        listFilling(list1, list2, result, end);

        // 3. The beginning and the end of the range defining
        int begin, limit, lastButTwo, lastButOne;
        if (list1.size() > list2.size()) {
            lastButTwo = list1.get(list1.size() - 2);
            lastButOne = list1.get(list1.size() - 1);
            begin = Math.min(lastButTwo, lastButOne);
            limit = Math.max(lastButTwo, lastButOne);
        } else {
            lastButTwo = list2.get(list2.size() - 2);
            lastButOne = list2.get(list2.size() - 1);
            begin = Math.min(lastButTwo, lastButOne);
            limit = Math.max(lastButTwo, lastButOne);
        }

        // 4. Result printing
        result.removeIf( (element) -> element <= begin || element >= limit);
        Collections.sort(result);
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void listFilling(List<Integer> list1, List<Integer> list2, List<Integer> result, int end) {
        for (int i = 0; i < end; i++) {
            int number1 = list1.get(i);
            int number2 = list2.get(i);
            result.add(number1);
            result.add(number2);
        }
    }

    private static List<Integer> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
