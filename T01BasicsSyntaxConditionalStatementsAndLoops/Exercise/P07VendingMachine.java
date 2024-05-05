package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Receiving money via while cycle
        double sum = 0;
        while (!input.equals("Start")) {
            double currentCoin = Double.parseDouble(input);
            if (isOneCoin(currentCoin)) {
                sum += currentCoin;
            } else {
                System.out.printf("Cannot accept %.2f\n", currentCoin);
            }
            input = scanner.nextLine();
        }

        // 3. Receiving money via second while cycle
        String input2 = scanner.nextLine();
        while (!input2.equals("End")) {
            String currentProduct = input2;
            double currentPrice = priceInit(currentProduct);
            productMessagePrinting(currentProduct, currentPrice, sum);
            sum = payProduct(sum, currentPrice);
            input2 = scanner.nextLine();
        }

        // 4. Change printing
        System.out.printf("Change: %.2f", sum);
    }

    private static double payProduct(double sum, double currentPrice) {
        if (sum >= currentPrice) {
            sum -= currentPrice;
        }
        return sum;
    }

    private static double priceInit(String currentProduct) {
        double price;
        switch (currentProduct) {
            case "Nuts":
                price = 2.0;
                break;
            case "Water":
                price = 0.7;
                break;
            case "Crisps":
                price = 1.5;
                break;
            case "Soda":
                price = 0.8;
                break;
            case "Coke":
                price = 1.0;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }
    private static void productMessagePrinting(String currentProduct, double price, double sum) {
        if (price == 0) {
            System.out.println("Invalid product");
        } else {
            if (sum >= price) {
                System.out.printf("Purchased %s\n", currentProduct);
            } else {
                System.out.println("Sorry, not enough money");
            }
        }
    }
    private static boolean isOneCoin(double currentCoin) {
        return currentCoin == 0.1 || currentCoin == 0.2 || currentCoin == 0.5
                || currentCoin == 1 || currentCoin == 2;
    }
}
