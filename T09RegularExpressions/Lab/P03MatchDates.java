package T09RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(?<day>\\d{2})([\\/.-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";
        String givenText = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(givenText);

        while (matcher.find()) {

            System.out.printf("Day: %s, Month: %s, Year: %s%n", matcher.group("day"), matcher.group("month"), matcher.group("year"));

        }

    }
}
