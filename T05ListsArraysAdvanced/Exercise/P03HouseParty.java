package T05ListsArraysAdvanced.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        List<String> partyAnimals = new ArrayList<>();

        for (int i = 1; i <= number; i++) {

            List<String> commands = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            boolean isHere = partyAnimals.contains(commands.get(0));
            String name = commands.get(0);

            if (commands.get(2).equals("going!") && !isHere) {
                partyAnimals.add(name);
            }
            if (commands.get(2).equals("going!") && isHere) {
                System.out.printf("%s is already in the list!%n", name );
            }
            if (commands.get(2).equals("not") && !isHere) {
                System.out.printf("%s is not in the list!%n", name );
            }
            if (commands.get(2).equals("not") && isHere) {
                partyAnimals.remove(name);
            }

        }

        for (String currentName : partyAnimals) {
            System.out.println(currentName);
        }
    }
}
