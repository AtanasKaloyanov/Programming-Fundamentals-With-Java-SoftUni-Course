package T09RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    private static final String regex = "(?<day>\\d{2})([\\/.-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String givenText = scanner.nextLine();

        // 2. Finding the matches:
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(givenText);

        while (matcher.find()) {
            String currentDay = matcher.group("day");
            String currentMonth = matcher.group("month");
            String currentYear = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", currentDay, currentMonth, currentYear);
        }

    }
}
