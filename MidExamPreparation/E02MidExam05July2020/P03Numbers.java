package MidExamPreparation.E02MidExam05July2020;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int curremtNumber = numbers.get(i);
            sum += curremtNumber;
        }

        double averageNumber = sum * 1.0 / numbers.size();

        Collections.sort(numbers);

        int counter = 0;
        boolean isTrue = false;

        for (int i = numbers.size() - 1; i >= 0 ; i--) {

            int currentNumber = numbers.get(i);

            if (currentNumber > averageNumber) {
                System.out.print(currentNumber + " ");
                isTrue = true;
                counter++;
            }

            if (counter == 5) {
                break;
            }

        }

        if (!isTrue) {
            System.out.println("No");
        }
    }
}
