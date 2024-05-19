package T07AssociateArraysDictionaries.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);

        // 2. Adding items as keys and quantities as Integer
        // in a map until getting a desired item.
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("shards", 0);
        map.put("fragments", 0);
        map.put("motes", 0);

        boolean hasItemObtained = false;

        while (true) {
            String[] array = scanner.nextLine().split(" ");
            for (int i = 0; i < array.length; i += 2) {
                int currentAddingQuantity = Integer.parseInt(array[i]);
                String currentMaterial = array[i + 1].toLowerCase();

                map.putIfAbsent(currentMaterial, 0);
                int currentQuantity = map.get(currentMaterial);
                int newQuantity = currentQuantity + currentAddingQuantity;
                map.put(currentMaterial, newQuantity);

                if (hasItemObtained(map)) {
                    hasItemObtained = true;
                    break;
                }
            }

            if (hasItemObtained) {
                removing250Elements(map);
                break;
            }
        }

        // 3. Output printing
        map.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
    }

    private static void removing250Elements(Map<String, Integer> map) {
        int lastElements;
        if (hasShadowmourneObtained(map)) {
            lastElements = map.get("shards") - 250;
            System.out.println("Shadowmourne obtained!");
            map.put("shards", lastElements);
        } else if (hasValanyrObtained(map)) {
            lastElements = map.get("fragments") - 250;
            map.put("fragments", lastElements);
            System.out.println("Valanyr obtained!");
        } else if (hasDragonwrathObtained(map)) {
            lastElements = map.get("motes") - 250;
            map.put("motes", lastElements);
            System.out.println("Dragonwrath obtained!");
        }
    }

    private static boolean hasItemObtained(Map<String, Integer> map) {
        return hasShadowmourneObtained(map) || hasValanyrObtained(map) || hasDragonwrathObtained(map);
    }

    private static boolean hasDragonwrathObtained(Map<String, Integer> map) {
        return map.get("motes") >= 250;
    }

    private static boolean hasValanyrObtained(Map<String, Integer> map) {
        return map.get("fragments") >= 250;
    }

    private static boolean hasShadowmourneObtained(Map<String, Integer> map) {
        return map.get("shards") >= 250;
    }
}




