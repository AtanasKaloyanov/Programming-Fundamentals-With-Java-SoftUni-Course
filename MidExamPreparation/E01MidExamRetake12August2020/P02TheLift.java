package MidExamPreparation.E01MidExamRetake12August2020;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int[] array = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= array.length - 1; i++) {

            while (array[i] < 4 && waitingPeople > 0) {
                waitingPeople = waitingPeople - 1;
                array[i] = array[i] + 1;
            }
        }

        if (waitingPeople == 0) {
            if (array[array.length - 1] != 4) {
                System.out.println("The lift has empty spots!");
                for (int spots : array) {
                    System.out.print(spots + " ");
                }
            } else {
                for (int spots : array) {
                    System.out.print(spots + " ");
                }
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
            for (int spots : array) {
                System.out.print(spots + " ");
            }
        }

    }
}
