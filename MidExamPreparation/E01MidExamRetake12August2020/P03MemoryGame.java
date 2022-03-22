package MidExamPreparation.E01MidExamRetake12August2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        int counter = 0;


            boolean win = false;

        while (!input.equals("end")) {

            List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            counter++;

            int firstIndex = numbers.get(0);
            int secondIndex = numbers.get(1);

            boolean outOfBounds = firstIndex < 0 || firstIndex > list.size() - 1;
            boolean outOfBounds2 = secondIndex < 0 || secondIndex > list.size() - 1;
            boolean equalIndexes = firstIndex == secondIndex;

            int middle = list.size() / 2;

            if (outOfBounds || outOfBounds2 || equalIndexes) {

                list.add(middle, "-" + counter + "a");
                list.add(middle, "-" + counter + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String firstElement = list.get(firstIndex);
                String secondElement = list.get(secondIndex);

                if (firstElement.equals(secondElement)) {

                    for (int i = list.size() - 1; i >= 0; i--) {
                        String currentString = list.get(i);
                        if (currentString.equals(firstElement))
                            list.remove(i);
                    }
                    System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
                } else {
                    System.out.println("Try again!");
                }
            }


            if (list.size() == 0) {
                win = true;
                System.out.printf("You have won in %d turns!%n", counter);
                break;
            }

            input = scanner.nextLine();
        }

        if (!win) {
            System.out.println("Sorry you lose :(");
            for (String currentElement : list) {
                System.out.print(currentElement + " ");
            }
        }

    }
}
