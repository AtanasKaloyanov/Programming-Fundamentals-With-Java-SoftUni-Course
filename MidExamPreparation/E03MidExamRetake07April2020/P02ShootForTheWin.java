package MidExamPreparation.E03MidExamRetake07April2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int shotsCounter = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);

            if (index < 0 || index > numbers.size() - 1) {
                input = scanner.nextLine();
                continue;
            } else {
                int target = numbers.get(index);
                numbers.set(index, -1);
                shotsCounter++;

                for (int i = 0; i < numbers.size(); i++) {
                    int currentNumber = numbers.get(i);

                    if (currentNumber != -1 && currentNumber > target) {
                        numbers.set(i, currentNumber - target);
                    } else if (currentNumber != -1 && currentNumber <= target) {
                        numbers.set(i, currentNumber + target);
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotsCounter);
        for (int currentNumber : numbers) {
            System.out.print(currentNumber + " ");
        }
    }
}