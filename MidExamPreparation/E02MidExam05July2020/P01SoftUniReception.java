package MidExamPreparation.E02MidExam05July2020;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());

        int students = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = firstEmployee + secondEmployee + thirdEmployee;


        int hours = 0;

       while (students > 0) {
            students = students - studentsPerHour;
            hours++;

            if (hours % 4 == 0) {
                hours++;
            }
       }

        System.out.printf("Time needed: %dh.",hours);

    }
}
