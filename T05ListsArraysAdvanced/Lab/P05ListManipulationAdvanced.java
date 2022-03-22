package T05ListsArraysAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            switch (command.get(0)) {
                case "Contains":
                    boolean isHere = numbers.contains(Integer.parseInt(command.get(1)));
                    if (isHere) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":

                    if (command.get(1).equals("even")) {
                        for (int number : numbers) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }

                        }
                    } else if (command.get(1).equals("odd")) {
                        for (int number : numbers) {
                            if (number % 2 != 0) {
                                System.out.print(number + " ");
                            }
                        }

                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentElement = numbers.get(i);
                        sum += currentElement;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":

                    switch (command.get(1)) {

                        case "<":
                            for (int number : numbers) {
                                if (number < Integer.parseInt(command.get(2))) {
                                    System.out.print(number + " ");
                                }
                            }

                            break;

                        case ">":
                            for (int number : numbers) {
                                if (number > Integer.parseInt(command.get(2))) {
                                    System.out.print(number + " ");
                                }
                            }

                            break;

                        case "<=":
                            for (int number : numbers) {
                                if (number <= Integer.parseInt(command.get(2))) {
                                    System.out.print(number + " ");
                                }
                            }

                            break;

                        case ">=":
                            for (int number : numbers) {
                                if (number >= Integer.parseInt(command.get(2))) {
                                    System.out.print(number + " ");
                                }
                            }

                            break;
                    }
                    System.out.println();
                    break;
            }

           input = scanner.nextLine();


        }

    }
}

