package T03Arrays.Lists.Lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int dayNumber = Integer.parseInt(scanner.nextLine());

        // 2. Invalid day check
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid day!");
            return;
        }

        // 3. Allocating a String array that holds the days of the week
        String[] array = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        // 4. Index defining and output printing:
        int index = dayNumber - 1;
        System.out.println(array[index]);
    }
}
