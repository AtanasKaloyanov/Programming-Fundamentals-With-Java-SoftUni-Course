package MidExamPreparation.E03MidExamRetake07April2020;

import java.util.Scanner;

public class P01CouterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int wonBattles = 0;
        boolean lose = false;

        while (!input.equals("End of battle")) {

            int distance = Integer.parseInt(input);
            if (distance > energy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
                lose = true;
                break;
            } else {
                energy -= distance;
                wonBattles++;
                if (wonBattles % 3 == 0) {
                    energy += wonBattles;
                }
            }
            input = scanner.nextLine();
        }
        if (!lose) {
            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
        }
    }
}
