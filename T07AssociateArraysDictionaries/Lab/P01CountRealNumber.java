package T07AssociateArraysDictionaries.Lab;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //8 2 2 8 2

        //  2 -> 3
        //  8 -> 2

        List<Double> list = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> numberAndCounts = new TreeMap<>();

        for (int i = 0; i <= list.size() - 1; i++) {

            double currentNum = list.get(i);

            if (numberAndCounts.containsKey(currentNum)) {

                numberAndCounts.put(currentNum, numberAndCounts.get(currentNum) + 1);

            } else {
                numberAndCounts.put(currentNum, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numberAndCounts.entrySet()) {

            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());

        }

    }
}
