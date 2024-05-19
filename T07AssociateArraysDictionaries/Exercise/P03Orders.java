package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Double> pricesByProducts = new LinkedHashMap<>();
        Map<String, Integer> quantitiesByProduct = new LinkedHashMap<>();

        // 2. Adding the prices and the quantity to the maps
        while (!input.equals("buy")) {
            String[] currentArray = input.split(" ");
            String currentProduct = currentArray[0];
            double currentPrice = Double.parseDouble(currentArray[1]);
            int currentQuantity = Integer.parseInt(currentArray[2]);

            pricesByProducts.put(currentProduct, currentPrice);
            quantitiesByProduct.putIfAbsent(currentProduct, 0);
            int newQuantity = quantitiesByProduct.get(currentProduct) + currentQuantity;
            quantitiesByProduct.put(currentProduct, newQuantity);

            input = scanner.nextLine();
        }

        // 3. Sum computation and printing:
        pricesByProducts.forEach( (product, price) -> {
            int currentQuantity = quantitiesByProduct.get(product);
            double currentSum = currentQuantity * price;
            System.out.printf("%s -> %.2f\n", product, currentSum);
        });
    }
}
