package FinalExamPreparation.E05FinalExam04April2020;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[*]{2}[A-Z][a-z]{2,}[*]{2}|[:]{2}[A-Z][a-z]{2,}[:]{2}";
        String text = scanner.nextLine();

        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(text);

        Pattern pattern = Pattern.compile("[0-9]");
        Matcher secondMatcher = pattern.matcher(text);

        BigInteger bi = BigInteger.valueOf(1);

        while (secondMatcher.find()) {
            long currentDigit = Long.parseLong(secondMatcher.group());
            bi =  bi.multiply(BigInteger.valueOf(currentDigit));
        }

        int counter = 0;

        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            counter++;

            String matched = matcher.group();

            String currentEmoji = matched.substring(2, matched.length() - 2);
            BigInteger sum  = BigInteger.valueOf(currentEmoji.chars().sum());

            if (bi.longValue() < sum.longValue()) {
//          if (bi.compareTo(sum) < 0)
                list.add(matched);
            }
        }

        System.out.printf("Cool threshold: %d%n", bi);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", counter);
        System.out.println(String.join(System.lineSeparator(), list));
    }
}
