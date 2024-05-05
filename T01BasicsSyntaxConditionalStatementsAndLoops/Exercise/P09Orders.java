package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());

        // 2. Coffee price adn total sum computation via for loop
        double totalSum = 0;
        for (int i = 0; i < orders; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double currentCoffeePrice = capsulePrice * days * capsuleCount;
            System.out.printf("The price for the coffee is: $%.2f\n", currentCoffeePrice);
            totalSum += currentCoffeePrice;
        }

        // 3. Output printing
        System.out.printf("Total: $%.2f", totalSum);
    }
}
