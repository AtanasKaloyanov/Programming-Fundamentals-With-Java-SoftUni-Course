package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= countOrders; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = pricePerCapsule * days * capsuleCount;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            totalPrice = totalPrice + orderPrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
