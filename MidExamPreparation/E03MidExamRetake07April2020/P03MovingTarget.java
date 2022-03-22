package MidExamPreparation.E03MidExamRetake07April2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = list.get(0);

            switch (command) {

                case "Shoot":

                    int index = Integer.parseInt(list.get(1));
                    int power = Integer.parseInt(list.get(2));

                    if (index < 0 || index > numbers.size() - 1) {
                        break;
                    } else {

                        int target = numbers.get(index);
                        numbers.set(index, target - power);

                        if (numbers.get(index) <= 0) {
                            numbers.remove(index);
                        }
                    }
                    break;

                case "Add":

                    int addIndex = Integer.parseInt(list.get(1));
                    int value = Integer.parseInt(list.get(2));

                    if (addIndex < 0 || addIndex > numbers.size() - 1) {
                        System.out.println("Invalid placement!");
                    } else {
                        numbers.add(addIndex, value);
                    }


                    break;

                case "Strike":

                    int strikeIndex = Integer.parseInt(list.get(1));
                    int radius = Integer.parseInt(list.get(2));

                    int leftBorder = strikeIndex - radius;
                    int rightBorder = strikeIndex + radius;

                    if (leftBorder < 0 || rightBorder > numbers.size() - 1) {
                        System.out.println("Strike missed!");
                    } else {
                        for (int i = rightBorder; i >= leftBorder; i--) {
                            numbers.remove(i);
                        }
                    }

                    break;
            }
            input = scanner.nextLine();
        }

         System.out.println(numbers.toString().replaceAll("[\\[\\]]", "")
                   .replaceAll("[,]", "\\|").replaceAll(" ", ""));



    }
}

