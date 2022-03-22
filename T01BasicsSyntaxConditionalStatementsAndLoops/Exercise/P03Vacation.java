package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfStay = scanner.nextLine();

        double sum = 0;

        switch (typeOfGroup) {
            case "Students":

                switch (dayOfStay) {
                    case "Friday":
                        sum = numberPeople * 8.45;
                        break;

                    case "Saturday":
                        sum = numberPeople * 9.80;
                        break;

                    case "Sunday":
                        sum = numberPeople * 10.46;
                        break;
                }

                if (numberPeople >= 30) {
                    sum = 0.85 * sum;
                }
                break;


            case "Business":
                switch (dayOfStay) {
                    case "Friday":
                        sum = numberPeople * 10.90;

                        if (numberPeople >= 100) {
                            sum = sum - 10 * 10.90;
                        }

                        break;


                    case "Saturday":
                        sum = numberPeople * 15.60;

                        if (numberPeople >= 100) {
                            sum = sum - 10 * 15.60;
                        }

                        break;

                    case "Sunday":
                        sum = numberPeople * 16.00;

                        if (numberPeople >= 100) {
                            sum = sum - 10 * 16.00;
                        }

                        break;
                }

                break;


            case "Regular":
                switch (dayOfStay) {
                    case "Friday":
                        sum = numberPeople * 15.00;
                        break;

                    case "Saturday":
                        sum = numberPeople * 20.00;
                        break;

                    case "Sunday":
                        sum = numberPeople * 22.50;
                        break;
                }

                if (numberPeople >= 10 && numberPeople <= 20) {
                    sum = 0.95 * sum;
                }
                break;

        }

        System.out.printf("Total price: %.2f", sum);

    }
}
