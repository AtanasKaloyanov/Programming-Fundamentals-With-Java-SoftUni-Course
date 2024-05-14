package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = readArray(scanner);
        int capacity = Integer.parseInt(scanner.nextLine());

        // 2. 2 commands implementation
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            if (input.startsWith("Add")) {
                String[] currentArray = input.split(" ");
                int number = Integer.parseInt(currentArray[1]);
                list.add(number);
            } else {
                int number = Integer.parseInt(input);

                for (int i = 0; i < list.size(); i++) {
                    boolean hasCapacity = list.get(i) + number <= capacity;
                    if (hasCapacity) {
                        int newNumber = list.get(i) + number;
                        list.set(i, newNumber);
                        break;
                    }
                }

            }
            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
