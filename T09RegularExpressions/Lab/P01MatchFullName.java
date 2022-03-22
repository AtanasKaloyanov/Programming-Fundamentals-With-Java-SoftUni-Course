package T09RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String givenText = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(givenText);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
