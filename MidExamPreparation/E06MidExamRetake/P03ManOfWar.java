package MidExamPreparation.E06MidExamRetake;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOfWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        boolean hasWon = false;
        boolean hasLost = false;


        while (!input.equals("Retire")) {
            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = list.get(0);

            switch (command) {

                case "Fire":
                    int index = Integer.parseInt(list.get(1));
                    int damage = Integer.parseInt(list.get(2));

                    if (index >= 0 && index <= warShip.size() - 1) {
                        int currentNumber = warShip.get(index);
                        warShip.set(index, currentNumber - damage);

                        if (warShip.get(index) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            hasWon = true;
                            break;
                        }
                    }
                    break;

                case "Defend":
                    int startIndex = Integer.parseInt(list.get(1));
                    int endIndex = Integer.parseInt(list.get(2));
                    int damage2 = Integer.parseInt(list.get(3));

                    if (startIndex >= 0 && startIndex <= pirateShip.size() - 1 && endIndex >= 0 && endIndex <= pirateShip.size() - 1) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            int currentSection = pirateShip.get(i);
                            pirateShip.set(i, currentSection - damage2);

                            if (pirateShip.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                hasLost = true;
                                break;
                            }
                        }
                    }

                    break;

                case "Repair":
                    int index2 = Integer.parseInt(list.get(1));
                    int health = Integer.parseInt(list.get(2));

                    if (index2 >= 0 && index2 <= pirateShip.size() - 1) {
                        int currentSection2 = pirateShip.get(index2);
                        pirateShip.set(index2, currentSection2 + health);

                        if (pirateShip.get(index2) > maxHealth) {
                            pirateShip.set(index2, maxHealth);
                        }
                    }
                    break;

                case "Status":
                    int repairingCounter = 0;
                    for (int i = 0; i <= pirateShip.size() - 1; i++) {
                        int currentSection2 = pirateShip.get(i);
                        if (currentSection2 < 0.2 * maxHealth) {
                            repairingCounter++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", repairingCounter);
                    break;
            }

            if (hasWon) {
                break;
            }

            if (hasLost) {
                break;
            }

            input = scanner.nextLine();
        }

if (!hasLost && !hasWon) {
    int pirateShipCounter = 0;
    for (int currenElement : pirateShip) {
pirateShipCounter += currenElement;
    }
    System.out.printf("Pirate ship status: %d%n", pirateShipCounter);

    int warShipCounter = 0;
    for (int currenElement : warShip) {
        warShipCounter += currenElement;
    }
    System.out.printf("Warship status: %d%n", warShipCounter);
}
    }
}
