package T04Methods.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P11ArrayManipulatorSecondSolution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = list.get(0);

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(list.get(1));

                    if (index < 0 || index > numbers.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        for (int i = 1; i <= index; i++) {
                            for (int j = numbers.size() - 1; j >= 1; j--) {
                                int formerElement = numbers.get(j - 1);
                                numbers.set(j, formerElement);
                            }
                            int lastElement = numbers.get(numbers.size() - 1);
                            numbers.set(0, lastElement);
                        }
                    }
                    break;

                case "max":
                    String evenOrOdd = list.get(1);
                    if (evenOrOdd.equals("even")) {

                        int max = Integer.MIN_VALUE;
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            int currentNumber = numbers.get(i);

                            if (currentNumber % 2 == 0 && currentNumber >= max) {
                                max = currentNumber;
                            }
                        }
                        if (max == Integer.MIN_VALUE) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(max);
                        }

                    } else if (evenOrOdd.equals("odd")) {

                        int max = Integer.MIN_VALUE;
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            int currentNumber = numbers.get(i);

                            if (currentNumber % 2 != 0 && currentNumber >= max) {
                                max = currentNumber;
                            }
                        }
                        if (max == Integer.MIN_VALUE) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(max);
                        }
                    }
                    break;

                case "min":
                    String evenOrOdd2 = list.get(1);
                    if (evenOrOdd2.equals("even")) {

                        int min = Integer.MAX_VALUE;
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            int currentNumber = numbers.get(i);

                            if (currentNumber % 2 == 0 && currentNumber <= min) {
                                min = currentNumber;
                            }
                        }
                        if (min == Integer.MAX_VALUE) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(min);
                        }

                    } else if (evenOrOdd2.equals("odd")) {

                        int min = Integer.MAX_VALUE;
                        for (int i = 0; i <= numbers.size() - 1; i++) {
                            int currentNumber = numbers.get(i);

                            if (currentNumber % 2 != 0 && currentNumber <= min) {
                                min = currentNumber;
                            }
                        }
                        if (min == Integer.MAX_VALUE) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(min);
                        }
                    }
                    break;

                case "first":
                    int count = Integer.parseInt(list.get(1));
                    String evenOrOdd3 = list.get(2);
                    if (count < 0 || count > numbers.size() - 1) {
                        System.out.println("Invalid count");
                    } else {
                        if (evenOrOdd3.equals("even")) {

                        } else if (evenOrOdd3.equals("odd")) {

                        }
                    }
                    break;

                case "last":
                    int count2 = Integer.parseInt(list.get(1));
                    String evenOrOdd4 = list.get(2);
                    if (count2 < 0 || count2 > numbers.size() - 1) {
                        System.out.println("Invalid count");
                    } else {
                        if (evenOrOdd4.equals("even")) {

                        } else if (evenOrOdd4.equals("odd")) {

                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }

    }
}
