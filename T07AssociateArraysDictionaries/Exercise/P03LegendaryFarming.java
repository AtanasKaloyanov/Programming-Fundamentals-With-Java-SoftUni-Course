package T07AssociateArraysDictionaries.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialsAndQuantitysMap = new LinkedHashMap<>();

        materialsAndQuantitysMap.put("shards", 0);
        materialsAndQuantitysMap.put("fragments", 0);
        materialsAndQuantitysMap.put("motes", 0);

        boolean is250orMore = false;

        while (conditions(materialsAndQuantitysMap)) {

            List<String> currentList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

            for (int i = 0; i <= currentList.size() - 1; i++) {

                int value = Integer.parseInt(currentList.get(i));
                String key = currentList.get(i + 1).toLowerCase();

                if (!materialsAndQuantitysMap.containsKey(key)) {
                    materialsAndQuantitysMap.put(key, value);

                    if (!conditions(materialsAndQuantitysMap)) {
                        is250orMore = true;
                        break;
                    }

                } else {

                    String secondKey = currentList.get(i + 1).toLowerCase();
                    int currentValue = materialsAndQuantitysMap.get(secondKey);
                    int addingValue = Integer.parseInt(currentList.get(i));

                    materialsAndQuantitysMap.put(secondKey, currentValue + addingValue);

                    if (!conditions(materialsAndQuantitysMap)) {
                        is250orMore = true;
                        break;
                    }
                }

                i++;

            }

            if (is250orMore) {
                break;
            }

        }

        for (Map.Entry<String, Integer> entry : materialsAndQuantitysMap.entrySet()) {
            if (entry.getKey().equals("shards") && entry.getValue() >= 250) {
                System.out.println("Shadowmourne obtained!");
                materialsAndQuantitysMap.put("shards", entry.getValue() - 250);

            } else if ((entry.getKey().equals("fragments") && entry.getValue() >= 250)) {
                System.out.println("Valanyr obtained!");
                materialsAndQuantitysMap.put("fragments", entry.getValue() - 250);

            } else if ((entry.getKey().equals("motes") && entry.getValue() >= 250)) {
                System.out.println("Dragonwrath obtained!");
                materialsAndQuantitysMap.put("motes", entry.getValue() - 250);

            }
        }
        for (Map.Entry<String, Integer> secondEntry : materialsAndQuantitysMap.entrySet()) {
            System.out.printf("%s: %s%n", secondEntry.getKey(), secondEntry.getValue());
        }

    }

    public static boolean conditions(Map<String, Integer> map) {
        if (map.get("shards") < 250 &&
                map.get("fragments") < 250 &&
                map.get("motes") < 250) {
            return true;
        }
        return false;
    }
}


// 3 Motes 5 stones 5 Shards
//6 leathers 255 fragments 7 Shards

// motes: 3
// stones: 5
// shards: 5
// leathers: 6
// fragments: 255
// shards: 7

//При получаване на:

// shards: 250       -->     Shadowmourne    --> shards: остатък
// fragments: 250    -->     Valanyr         --> fragments: остатък
// motes: 250        -->     Dragonwrath     --> motes: остатък




