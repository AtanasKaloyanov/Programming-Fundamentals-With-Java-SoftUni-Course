package FinalExamPreparation.E03FinalExamRetake10April2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([#@])[A-Za-z]{3,}\\1\\1[A-Za-z]{3,}\\1";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int matches = 0;
        int mirrorCounter = 0;

        List<String> allWords = new ArrayList<>();

        while (matcher.find()) {

            matches++;

            String[] array = matcher.group().split("[#@]{2}");
            String firstElement = array[0];
            String secondElement = array[1];

            StringBuilder sb = new StringBuilder(firstElement);
            String reversedFirstElement = sb.reverse().toString();

            if (reversedFirstElement.equals(secondElement)) {
                mirrorCounter++;
                allWords.add(firstElement.replaceAll("[#@]", "") + " <=> " + secondElement.replaceAll("[#@]", ""));
            }
        }

        if (matches != 0) {
            System.out.printf("%d word pairs found!%n", matches);
        } else {
            System.out.println("No word pairs found!");
        }

        if (mirrorCounter != 0) {
            System.out.println("The mirror words are:");

            System.out.println(allWords.toString().replaceAll("[\\[\\]]", ""));

        } else {
            System.out.println("No mirror words!");
        }
    }
}
