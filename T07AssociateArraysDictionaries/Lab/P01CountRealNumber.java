package T07AssociateArraysDictionaries.Lab;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Double> list = readList(scanner);

        // 2. Sorting via Tree map
        Map<Double, Integer> occurrencesOfNumbers = new TreeMap<>();
        for (Double number : list) {
            occurrencesOfNumbers.putIfAbsent(number, 0);
            int currentOcc = occurrencesOfNumbers.get(number);
            occurrencesOfNumbers.put(number, currentOcc + 1);
        }

        // 3. Output printing
        occurrencesOfNumbers.forEach((key, value) -> {
            DecimalFormat df = new DecimalFormat("0.#####");
            String keyFormat = df.format(key);
            System.out.printf("%s -> %d\n", keyFormat, value);
        });
    }

    private static List<Double> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map((element) -> Double.parseDouble(element))
                .collect(Collectors.toList());
    }
}
