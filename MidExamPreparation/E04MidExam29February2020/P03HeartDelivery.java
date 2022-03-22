package MidExamPreparation.E04MidExam29February2020;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int cupidonPosition = 0;

        while (!input.equals("Love!")) {
            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            int moves = Integer.parseInt(list.get(1));
            cupidonPosition += moves;

            if (cupidonPosition > houses.size() - 1) {
                cupidonPosition = 0;
                int firstHouse = houses.get(0);

                if (firstHouse == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", cupidonPosition);
                } else {
                    firstHouse -= 2;
                    houses.set(0, firstHouse);
                    if (firstHouse == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", cupidonPosition);
                    }
                }

            } else {
                int currentHouse = houses.get(cupidonPosition);

                if (currentHouse == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", cupidonPosition);
                } else {
                    currentHouse -= 2;
                    houses.set(cupidonPosition, currentHouse);
                    if (currentHouse == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", cupidonPosition);
                    }

                }
            }

            input = scanner.nextLine();
        }
        int counter = 0;
        for (int currentHouse : houses) {
               if (currentHouse != 0) {
                   counter++;
               }
        }

        if (counter == 0) {
            System.out.printf("Cupid's last position was %d.%n", cupidonPosition);
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid's last position was %d.%n", cupidonPosition);
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }
}
