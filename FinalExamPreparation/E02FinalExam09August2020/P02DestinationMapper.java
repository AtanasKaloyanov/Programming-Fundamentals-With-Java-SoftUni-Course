package ExamPreparation.E02FinalExam09August2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([=\\/])[A-Z][A-Za-z]{2,}\\1";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> destinations = new ArrayList<>();

        while (matcher.find()) {
            destinations.add(matcher.group());
        }

        System.out.printf("Destinations: %s%n",destinations.toString().replaceAll("[\\[\\]=\\/]", ""));

        int counter = 0;

        for (int i = 0; i < destinations.toString().length() ; i++) {

            char currentChar = destinations.toString().charAt(i);
            if (currentChar != 91 && currentChar != 93 && currentChar != 61 && currentChar != 47 && currentChar != 44 && currentChar != 32) {
                counter++;
            }
        }

        System.out.printf("Travel Points: %d", counter);
    }
}
