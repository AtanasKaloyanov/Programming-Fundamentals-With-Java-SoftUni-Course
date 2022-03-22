package MidExamPreparation.E05MidExam;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        double max = Double.MIN_VALUE;
        int maxAttendance = 0;

        while (counter <= students) {
            int attendance = Integer.parseInt(scanner.nextLine());

            double totalBonus = attendance * 1.0 / lectures * (5 + bonus);
            double totalBonus2 = Math.ceil(totalBonus);

            if (totalBonus2 >= max) {
                max  =  totalBonus2;
                maxAttendance = attendance;
            }
            counter++;
        }
        System.out.printf("Max Bonus: %.0f.%n", max);
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
