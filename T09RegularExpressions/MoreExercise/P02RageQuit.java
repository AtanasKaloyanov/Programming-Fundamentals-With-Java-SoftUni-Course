package T09RegularExpressions.MoreExercise;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {
    private static final String regex = "(?<text>[^\\d]+)(?<digit>\\d+)";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // 2. Adding the messages to StringBuilder
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            int currentDigit = Integer.parseInt(matcher.group("digit"));
            if (currentDigit == 0) {
                continue;
            }
            String currentText = matcher.group("text").toUpperCase();
            for (int i = 0; i < currentDigit; i++) {
                sb.append(currentText);
            }
        }

        // 3. Finding unique symbols and output printing:
        long wordsCount = sb.chars().distinct().count();
        System.out.printf("Unique symbols used: %d\n", wordsCount);
        System.out.print(sb);
    }
}
