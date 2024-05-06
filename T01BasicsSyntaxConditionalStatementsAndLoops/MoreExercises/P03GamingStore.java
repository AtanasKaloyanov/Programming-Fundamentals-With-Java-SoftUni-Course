package T01BasicsSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());

        // 2. Buying games via while cycle
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("Game Time")) {
            String currentGame = input;
            double gamePrice = getPrice(currentGame);
            if (gamePrice == 0) {
                System.out.println("Not Found");
                input = scanner.nextLine();
                continue;
            } else {
                if (balance >= gamePrice) {
                    balance -= gamePrice;
                    sum += gamePrice;
                    System.out.printf("Bought %s\n", currentGame);
                } else {
                    System.out.println("Too Expensive");
                }
            }

            if (zeroMoney(balance)) return;
            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, balance);
    }

    private static boolean zeroMoney(double balance) {
        if (balance == 0) {
            System.out.println("Out of money!");
            return true;
        }
        return false;
    }

    private static double getPrice(String currentGame) {
        double price = 0;
        switch (currentGame) {
            case "OutFall 4":
                price = 39.99;
                break;
            case "CS: OG":
                price = 15.99;
                break;
            case "Zplinter Zell":
                price = 19.99;
                break;
            case "Honored 2":
                price = 59.99;
                break;
            case "RoverWatch":
                price = 29.99;
                break;
            case "RoverWatch Origins Edition":
                price = 39.99;
                break;
        }
        return price;
    }


}
