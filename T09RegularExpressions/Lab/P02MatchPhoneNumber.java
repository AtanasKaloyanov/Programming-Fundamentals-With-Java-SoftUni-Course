package T09RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    private static final String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // 2. Adding all matches in a list via Pattern and Matcher classes:
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> matcherList = new ArrayList<>();

        while (matcher.find()) {
            matcherList.add(matcher.group());
        }

        // 3. Output printing
        System.out.print(matcherList.toString().replaceAll("[\\[\\]]", ""));
    }
}
