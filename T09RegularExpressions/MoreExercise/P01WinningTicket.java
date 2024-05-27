package T09RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {
    private static final String winningRegex = "@{6,9}|#{6,9}|\\${6,9}|\\^{6,9}";
    private static final String jackpotRegex = "@{20}|#{20}|\\${20}|\\^{20}";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String[] tickets = scanner.nextLine().split("[\\s,]+");
        Pattern winningPattern = Pattern.compile(winningRegex);
        Pattern jackpotPattern = Pattern.compile(jackpotRegex);

        for (String ticket : tickets) {
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }

            Matcher jackpotMatcher = jackpotPattern.matcher(ticket);

            String firstHalf = ticket.substring(0, 10);
            String secondHalf = ticket.substring(10);
            Matcher firstHalfWinningMatcher = winningPattern.matcher(firstHalf);
            Matcher secondHalfWinningMatcher = winningPattern.matcher(secondHalf);

            if (jackpotMatcher.find()) {
                char symbol = jackpotMatcher.group().charAt(0);
                System.out.printf("ticket \"%s\" - 10%c Jackpot!\n", ticket, symbol);
            } else if (firstHalfWinningMatcher.find() && secondHalfWinningMatcher.find()) {
                String firstGroup = firstHalfWinningMatcher.group();
                String secondGroup = secondHalfWinningMatcher.group();
                int symbolsMinNumber = Math.min(firstGroup.length(), secondGroup.length());
                char symbol = firstGroup.charAt(0);
                System.out.printf("ticket \"%s\" - %d%c\n", ticket, symbolsMinNumber, symbol);
            } else {
                System.out.printf("ticket \"%s\" - no match\n", ticket);
            }
        }
    }
}
