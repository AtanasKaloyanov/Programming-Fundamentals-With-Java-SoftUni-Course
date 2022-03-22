package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        int winningValue = 0;
        int secondWinnigValue = 0;
        int thirdWinningValue = 0;

        for (int i = 1; i <= numberOfSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = (snowballSnow * 1.0 / snowballTime);
            double finalSnowballValue = Math.pow(snowballValue, snowballQuality);

            if (finalSnowballValue > max) {
                max = finalSnowballValue;
                winningValue = snowballSnow;
                secondWinnigValue = snowballTime;
                thirdWinningValue = snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)", winningValue, secondWinnigValue, max, thirdWinningValue);

    }
}
