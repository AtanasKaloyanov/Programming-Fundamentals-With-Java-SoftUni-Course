package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxPassengers = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List <String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            if (command.get(0).equals("Add")) {
                int lastWagonPassengers = Integer.parseInt(command.get(1));
                wagons.add(wagons.size(), lastWagonPassengers);
            } else {
                int addedPassengers = Integer.parseInt(command.get(0));

                for (int i = 0; i < wagons.size() ; i++) {
                   int currentWagonPassengers = wagons.get(i);

                    if (currentWagonPassengers + addedPassengers > maxPassengers) {
                        continue;
                    } else {
                        wagons.set(i, currentWagonPassengers + addedPassengers);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));

    }

}
