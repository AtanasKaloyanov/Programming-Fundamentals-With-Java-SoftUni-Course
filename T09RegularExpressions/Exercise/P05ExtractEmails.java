package T09RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05ExtractEmails {
    private static final String regex = "[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*@[a-zA-Z]+(\\-?[a-zA-Z]+)*(\\.[a-zA-Z]+(\\-?[a-zA-Z]+)*){1,}";
    // user - [a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*
    // @
    // host - [a-zA-Z]+(\-?[a-zA-Z]+)*(\.[a-zA-Z]+(\-?[a-zA-Z]+)*){1,}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
