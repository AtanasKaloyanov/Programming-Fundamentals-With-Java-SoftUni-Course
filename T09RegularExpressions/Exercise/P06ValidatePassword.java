package T09RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ValidatePassword {
    private static final String passwordRegex = "_\\.+([A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
    private static final String digitRegex = "[0-9]+";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Pattern passwordPattern = Pattern.compile(passwordRegex);
        Pattern digitPattern = Pattern.compile(digitRegex);

        for (int i = 0; i < n; i++) {
            String currentPassword = scanner.nextLine();
            Matcher passwordMatcher = passwordPattern.matcher(currentPassword);

            if (passwordMatcher.find()) {
                StringBuilder sb = new StringBuilder();
                String currentPass = passwordMatcher.group();
                Matcher digitMatcher = digitPattern.matcher(currentPass);

                while (digitMatcher.find()) {
                    sb.append(digitMatcher.group());
                }

                String group = sb.isEmpty() ? "default" : sb.toString();
                System.out.printf("Group: %s\n", group);
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
