package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> productPriceAndQuantityMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] currentArray = input.split(" ");
            String product = currentArray[0];
            double price = Double.parseDouble(currentArray[1]);
            double quantity = Double.parseDouble(currentArray[2]);

            if (!productPriceAndQuantityMap.containsKey(product)) {
                productPriceAndQuantityMap.put(product, new ArrayList<>());
                productPriceAndQuantityMap.get(product).add(price);
                productPriceAndQuantityMap.get(product).add(quantity);
            } else {
                productPriceAndQuantityMap.get(product).set(0, price);
                Double currentQuantity = productPriceAndQuantityMap.get(product).get(1);
                productPriceAndQuantityMap.get(product).set(1, currentQuantity + quantity);
            }

            input = scanner.nextLine();
        }

        Map<String, Double> printingMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : productPriceAndQuantityMap.entrySet()) {

            printingMap.put(entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));

        }

        printingMap.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));

        // Beer 2.40 350
        // Water 1.25 200
        // IceTea 5.20 100
        // Beer 1.20 200
        // IceTea 0.50 120
        // buy

        // Beer --> 1.20, 550
        // Water --> 1.25, 200
        // IceTea --> 0.50, 220

        // Beer --> 660.00
        // Water --> 250.00
        // IceTea --> 110.00
    }
}
