package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {

            double coin = Double.parseDouble(input);

            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f%n", coin);
            }

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sum = sum + coin;
            }


            input = scanner.nextLine();
        }

        String command = scanner.nextLine();


        while (!command.equals("End")) {

            double price = 0;



            String product = command;

            switch (product) {
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
                    System.out.println("Invalid product");
            }




            if ((product.equals("Nuts") || product.equals("Water") || product.equals("Crisps")
                    || product.equals("Soda") || product.equals("Coke")) && (price <= sum)) {
                System.out.printf("Purchased %s%n", product);

            }

            if ((product.equals("Nuts") || product.equals("Water") || product.equals("Crisps")
                    || product.equals("Soda") || product.equals("Coke")) && (price > sum)) {
                System.out.println("Sorry, not enough money");
            }


if (sum >= price) {
    sum = sum - price;
}
            command = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);

    }
}
