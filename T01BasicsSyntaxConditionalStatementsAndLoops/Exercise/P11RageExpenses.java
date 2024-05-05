package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        // 2. Trashes calculating
        int headsetTrashes = lostGames / 2;
        int mouseTrashes = lostGames / 3;
        int keyboardTrashes = lostGames / 6;
        int displayTrashes = lostGames / 12;

        // 3. Trashes costs calculating
        double trashesCosts = headsetTrashes * headsetPrice + mouseTrashes * mousePrice
                + keyboardTrashes * keyboardPrice + displayTrashes * displayPrice;

        // 4. Output printing
        System.out.printf("Rage expenses: %.2f lv.", trashesCosts);
    }
}
