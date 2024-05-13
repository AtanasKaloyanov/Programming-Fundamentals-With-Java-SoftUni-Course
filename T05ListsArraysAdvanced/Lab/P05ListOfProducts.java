package T05ListsArraysAdvanced.Lab;

import java.util.*;

public class P05ListOfProducts {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Adding the products to a tree set
        Set<String> products = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String currentProduct = scanner.nextLine();
            products.add(currentProduct);
        }

        // 3. Output printing
        int counter = 1;
        for (String currentProduct : products) {
            System.out.printf("%d.%s\n", counter, currentProduct);
            counter++;
        }
    }

}
