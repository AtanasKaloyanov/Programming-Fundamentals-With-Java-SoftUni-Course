package MidExamPreparation.E05MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;
        boolean isDead = false;

        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        int counter = 0;

        while (counter <= list.size() - 1) {
            String currentString = list.get(counter);
            int currentIndex = list.indexOf(currentString);
            int max = Integer.MIN_VALUE;
            int bestRoom = 0;

            List<String> secondList = Arrays.stream(currentString.split(" ")).collect(Collectors.toList());
            String command = secondList.get(0);
            int number = Integer.parseInt(secondList.get(1));

            switch (command) {
                case "potion":
                    health += number;

                    if (health > 100) {
                        number = 100 - (health - number);
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;

                case "chest":
                    bitcoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
            }

            if (!command.equals("potion") && (!command.equals("chest"))) {
                health -= number;

                if (number > max) {
                    max = number;
                    bestRoom = currentIndex + 1;
                }

                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", bestRoom);
                    isDead = true;
                    break;
                }
            }
            counter++;
        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
