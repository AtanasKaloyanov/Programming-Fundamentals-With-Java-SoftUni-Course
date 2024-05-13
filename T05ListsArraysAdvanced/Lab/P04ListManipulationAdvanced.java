package T05ListsArraysAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationAdvanced {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = readList(scanner);

        // 2. Commands implementation
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] currentArray = input.split(" ");
            String command = currentArray[0];

            switch (command) {
                case "Contains":
                    int containsNumber = Integer.parseInt(currentArray[1]);
                    if (list.contains(containsNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String command2 = currentArray[1];
                    StringBuilder result = new StringBuilder();

                    for (int i = 0; i < list.size(); i++) {
                        int currentNumber = list.get(i);
                        numbersAdding(command2, result, currentNumber);
                    }

                    System.out.println(result);
                    break;
                case "Get":
                    int sum = list.stream().mapToInt(element -> element).sum();
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = currentArray[1];
                    int number = Integer.parseInt(currentArray[2]);
                    StringBuilder result2 = new StringBuilder();
                    for (int current : list) {
                        conditionImplementation(condition, number, result2, current);
                    }

                    System.out.println(result2);
                    break;
            }

            input = scanner.nextLine();
        }

    }

    private static void numbersAdding(String command2, StringBuilder result, int currentNumber) {
        if (command2.equals("even") && currentNumber % 2 == 0) {
            result.append(currentNumber).append(" ");
        } else if (command2.equals("odd") && currentNumber % 2 != 0) {
            result.append(currentNumber).append(" ");
        }
    }

    private static void conditionImplementation(String condition, int number, StringBuilder result2, int current) {
        switch (condition) {
            case "<":
                if (current < number) {
                    result2.append(current).append(" ");
                }
                break;
            case ">":
                if (current > number) {
                    result2.append(current).append(" ");
                }
                break;
            case ">=":
                if (current >= number) {
                    result2.append(current).append(" ");
                }
                break;
            case "<=":
                if (current <= number) {
                    result2.append(current).append(" ");
                }
                break;
        }
    }

    private static List<Integer> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}

