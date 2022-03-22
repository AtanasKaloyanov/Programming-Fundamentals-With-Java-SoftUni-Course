package MidExamPreparation.E01MidExamRetake12August2020;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("special") && !input.equals("regular")) {

            double partPrice = Double.parseDouble(input);

            if (partPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                sum = sum + partPrice;
            }
            input = scanner.nextLine();
        }

        double taxes = 0.2 * sum;
        double totalPrice = sum + taxes;

        if (input.equals("special")) {
            totalPrice = 0.9 * totalPrice;
        }

        if (totalPrice != 0) {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);
        } else {
            System.out.println("Invalid order!");
        }

    }
}

