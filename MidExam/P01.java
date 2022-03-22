package MidExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double groupsEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDayForOnePerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayForOnePerson = Double.parseDouble(scanner.nextLine());

        double totalWater = days * players * waterPerDayForOnePerson;
        double totalFood = days * players * foodPerDayForOnePerson;

        int counterDays = 1;
        boolean fall = false;

        while (counterDays <= days) {

            double loosingEnergy = Double.parseDouble(scanner.nextLine());
            groupsEnergy = groupsEnergy - loosingEnergy;


            if (groupsEnergy <= 0) {
                fall = true;
                break;
            }

            if (counterDays % 2 == 0) {
                groupsEnergy = 1.05 * groupsEnergy;
                totalWater = 0.7 * totalWater;
            }

            if (counterDays % 3 == 0) {
                groupsEnergy = 1.10 * groupsEnergy;
                double eatenFood = totalFood / players;
                totalFood = totalFood - eatenFood;
            }


            counterDays++;
        }

        if (fall) {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        } else {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupsEnergy);
        }
    }
}
