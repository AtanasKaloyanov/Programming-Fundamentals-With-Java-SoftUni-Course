package T05ListsArraysAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P06RemoveNegativesAndReverse {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = readArray(scanner);

        // 2. Removing the numbers that are lower to 0. Then reversing the collection
        list.removeIf((element) -> element < 0);
        Collections.reverse(list);

        // 3. Output printing - 2 cases:
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static List<Integer> readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
