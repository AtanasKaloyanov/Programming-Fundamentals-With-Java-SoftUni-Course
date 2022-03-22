package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P03LegendaryFarmingSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean hasWon = false;

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map <String, String> legendaryItems = new HashMap<>();
        legendaryItems.put("shards", "Shadowmourne obtained!");
        legendaryItems.put("fragments", "Valanyr obtained!");
        legendaryItems.put("motes", "Dragonwrath obtained!");

        String winner = "";
        while (!hasWon) {

            String[] data = scanner.nextLine().split(" ");
            for (int i = 0; i < data.length - 1; i += 2) {

                int quantity = Integer.parseInt(data[i]);
                String recourse = data[i + 1].toLowerCase();

                items.putIfAbsent(recourse, 0);
                items.put(recourse, items.get(recourse) + quantity);

                if (recourse.equals("shards") || recourse.equals("fragments") || recourse.equals("motes")) {

                    if (items.get(recourse) >= 250) {
                        items.put(recourse, items.get(recourse) - 250);
                        winner = recourse;
                        hasWon = true;
                        break;
                    }
                }
            }
        }

        System.out.println(legendaryItems.get(winner));
        items.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));

    }
}
