package T09RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

       List<String> matcherList = new ArrayList<>();

        while (matcher.find()) {
           matcherList.add(matcher.group());
        }


        System.out.print(matcherList.toString().replaceAll("[\\[\\]]", ""));
        //System.out.print(String.join(", ", matcherList));
    }
}
