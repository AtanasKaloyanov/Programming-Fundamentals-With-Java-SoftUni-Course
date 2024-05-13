package T05ListsArraysAdvanced.Lab;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P00SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Double> list = readList(scanner);

        // 2. Removing 2 adjacent number and set their sum instead
        for (int i = 0; i < list.size() - 1; i++) {
            double currentNumber = list.get(i);
            double previousNumber = list.get(i + 1);

            if (currentNumber == previousNumber) {
                double sum = currentNumber + previousNumber;
                list.remove(i);
                list.remove(i);
                list.add(i, sum);
                i --;
            }
        }

        // 3. Output printing via Decimal Format
        for (Double current : list) {
            DecimalFormat df = new DecimalFormat("0.####");
            String numberInFormat = df.format(current);
            System.out.print(numberInFormat + " ");
        }

    }

    private static List<Double> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }
}
