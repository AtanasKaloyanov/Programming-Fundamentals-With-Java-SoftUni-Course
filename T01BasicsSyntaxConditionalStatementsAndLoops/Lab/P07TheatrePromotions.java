package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P07TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticket = 0;

        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18 ) {
                    ticket = 12;
                } else if (age > 18 && age <= 64) {
                    ticket = 18;
                } else if (age > 64 && age <= 122) {
                    ticket = 12;
                }

                break;
            case "Weekend":
                if  (age >= 0 && age <= 18 ) {
                    ticket = 15;
                } else if  (age > 18 && age <= 64){
                    ticket = 20;
                } else if (age > 64 && age <= 122) {
                    ticket = 15;
                }

                break;
            case "Holiday":
                if (age >= 0 && age <= 18 ) {
                    ticket = 5;
                } else if (age > 18 && age <= 64) {
                    ticket = 12;
                } else if (age > 64 && age <= 122) {
                    ticket = 10;
                }
                break;

        }
        if (ticket > 0) {
            System.out.printf("%d$", ticket);
        } else {
            System.out.println("Error!");
        }

    }
}
