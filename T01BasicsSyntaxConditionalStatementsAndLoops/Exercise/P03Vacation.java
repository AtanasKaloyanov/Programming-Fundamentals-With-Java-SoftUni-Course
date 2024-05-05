package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String clientType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        // 2. Ticket's price assignment
        double ticketPrice = 0;
        switch (clientType) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    ticketPrice = 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    ticketPrice = 9.80;
                } else {
                    ticketPrice = 10.46;
                }

                if (n >= 30) {
                    ticketPrice *= 0.85;
                }
                break;

            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    ticketPrice = 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    ticketPrice = 15.60;
                } else {
                    ticketPrice = 16;
                }

                if (n >= 100) {
                    n -= 10;
                }
                break;

            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    ticketPrice = 15;
                } else if (dayOfWeek.equals("Saturday")) {
                    ticketPrice = 20;
                } else {
                    ticketPrice = 22.50;
                }

                if (n >= 10 && n <= 20) {
                    ticketPrice *= 0.95;
                }
                break;
        }

        // 3. Sum computation and printing
        double sum = n * ticketPrice;
        System.out.printf("Total price: %.2f", sum);
    }
}
