package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P04IWillBeBackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesIn30Minutes = minutes + 30;

        if (minutesIn30Minutes >= 60) {

            int hoursIn30Minutes = hours + 1;
            minutesIn30Minutes = minutesIn30Minutes % 60;

            if (hoursIn30Minutes == 24) {
                hoursIn30Minutes = 0;
            }
            if (minutesIn30Minutes < 10) {
                System.out.printf("%d:%02d", hoursIn30Minutes, minutesIn30Minutes);
            } else {

                System.out.printf("%d:%d", hoursIn30Minutes, minutesIn30Minutes);
            }
        } else {
            System.out.printf("%d:%d", hours, minutesIn30Minutes);
        }


    }
}