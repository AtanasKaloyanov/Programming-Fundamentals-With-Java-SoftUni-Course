package MidExamPreparation.E02MidExam05July2020;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = list.get(0);

            switch (command) {

                case "swap" :

                    int firstElement = Integer.parseInt(list.get(1));
                    int secondElement = Integer.parseInt(list.get(2));

                    Collections.swap(numbers, firstElement, secondElement);

                    break;

                case "multiply" :

                    int index0 = Integer.parseInt(list.get(1));
                    int index1 = Integer.parseInt(list.get(2));

                    numbers.set(index0, numbers.get(index0) * numbers.get(index1));

                    break;

                case "decrease" :

                    for (int i = 0; i < numbers.size(); i++) {

                        int currentElement = numbers.get(i);
                        numbers.set(i, currentElement - 1);

                    }

                    break;

            }
            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
