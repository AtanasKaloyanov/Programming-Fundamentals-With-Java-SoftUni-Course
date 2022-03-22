package T05ListsArraysAdvanced.Lab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentElement = numbers.get(i);
            double nextElement = numbers.get(i + 1);

            if (currentElement == nextElement) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = -1;
            }
        }

        for (double currentNumber : numbers) {
            DecimalFormat df = new DecimalFormat("0.#####");
            System.out.print(df.format(currentNumber) + " ");
        }

    }
}
