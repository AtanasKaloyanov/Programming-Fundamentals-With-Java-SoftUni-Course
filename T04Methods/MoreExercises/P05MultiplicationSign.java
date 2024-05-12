package T04Methods.MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        // 2. Check if some of the numbers is zero. Then counting the negative numbers
        List<Integer> numbers = new ArrayList<>(List.of(number1, number2, number3));
        int negativeCounter = 0;
        for (Integer number : numbers) {
            if (number == 0) {
                System.out.println("zero");
                return;
            }

            if (number < 0) {
                negativeCounter++;
            }
        }

        // 3. Output printing - 2 cases:
        if (negativeCounter % 2 == 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
