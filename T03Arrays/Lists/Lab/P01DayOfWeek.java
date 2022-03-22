package T03Arrays.Lists.Lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Enter a day number and print the day name (in English) or "Invalid day!". Use an array of strings.

        int givenNumber = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (givenNumber >= 1 && givenNumber <= 7) {
            System.out.println(days[givenNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
