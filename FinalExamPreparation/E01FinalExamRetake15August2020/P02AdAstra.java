package ExamPreparation.E01FinalExamRetake15August2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([\\|#])(?<item>[A-Za-z ]+)\\1(?<bestBefore>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<nutrition>[0-9]{1,5})\\1";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int nutrition = 0;
        while (matcher.find()) {
             nutrition += Integer.parseInt(matcher.group("nutrition"));
        }

        int days = nutrition / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);

        Matcher secondMatcher = pattern.matcher(text);

        while (secondMatcher.find()) {

            String currentItem = secondMatcher.group("item");
            String currentBestBefore = secondMatcher.group("bestBefore");
            String currentNutrition = secondMatcher.group("nutrition");

            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", currentItem, currentBestBefore, currentNutrition);
        }
    }
}
