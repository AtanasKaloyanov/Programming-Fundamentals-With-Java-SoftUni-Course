package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        // 2. Sum computation
        int lightsaberNumber = (int) Math.ceil(students * 1.1);
        int freeBelts = students / 6;
        int beltsNumber = students - freeBelts;

        double costs = lightsaberNumber * lightsaberPrice
                + students * robePrice + beltsNumber * beltPrice;

        // 3. Output printing - 2 cases:
        if (amount >= costs) {
            System.out.printf("The money is enough - it would cost %.2flv.", costs);
        } else {
            double neededMoney = costs - amount;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }
    }
}
