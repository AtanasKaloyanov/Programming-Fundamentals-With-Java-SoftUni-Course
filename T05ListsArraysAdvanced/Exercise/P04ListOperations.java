package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = list.get(0);

            switch (command) {

                case "Add":

                    int addedNumber = Integer.parseInt(list.get(1));
                    numbers.add(numbers.size(), addedNumber);

                    break;

                case "Insert":

                    int insertedNumber = Integer.parseInt(list.get(1));
                    int insertedIndex = Integer.parseInt(list.get(2));

                    if (insertedIndex > numbers.size() - 1 || insertedIndex < 0) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(insertedIndex, insertedNumber);
                    }
                    break;

                case "Remove":

                    int removedIndex = Integer.parseInt(list.get(1));

                    if (removedIndex > numbers.size() - 1 || removedIndex < 0) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(removedIndex);
                    }

                    break;

                case "Shift":

                    String movingDirection = list.get(1);
                    int movingTimes = Integer.parseInt(list.get(2));

                    if (movingDirection.equals("left")) {

                            int i = 0;

                            while (i != movingTimes) {
                                int firstNumber = numbers.get(0);
                                numbers.add(numbers.size(), firstNumber);
                                numbers.remove(0);
                                i++;
                            }

                    } else if (movingDirection.equals("right")) {

                            int i = 0;

                            while (i != movingTimes) {
                                int lastNumber = numbers.get(numbers.size() - 1);
                                numbers.add(0, lastNumber);
                                numbers.remove(numbers.size() - 1);
                                i++;
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int currentNumber : numbers) {
            System.out.print(currentNumber + " ");
        }
    }
}
