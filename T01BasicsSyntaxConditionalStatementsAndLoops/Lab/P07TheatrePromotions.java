package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P07TheatrePromotions {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        // 2. Ticket assignment
        int ticketPrice = 0;
        switch (dayType) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 12;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 18;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 12;
                }
                break;

            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 15;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 20;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 15;
                }
                break;

            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 5;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 12;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 10;
                }
                break;
        }

        // 3. Output
        if (ticketPrice == 0) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", ticketPrice);
        }
    }
}
