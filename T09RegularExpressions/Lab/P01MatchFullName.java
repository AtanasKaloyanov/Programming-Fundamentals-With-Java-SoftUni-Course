package T09RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {
    private static final String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String givenText = scanner.nextLine();

        // 2. Printing matches via Pattern and Matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(givenText);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
