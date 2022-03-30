package FinalExamPreparation.E02FinalExam09August2020;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02DestinationMapperSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([=\\/])[A-Z][A-Za-z]{2,}\\1";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            sb.append(matcher.group() + " ");
        }

        String stringForSplitting =  sb.toString().replaceAll("[=\\/]", "");
        List<String> list = Arrays.stream(stringForSplitting.split("\\s+")).collect(Collectors.toList());

        System.out.printf("Destinations: %s%n", String.join(", ", list));

        int counter = 0;

        for (int i = 0; i < sb.length() ; i++) {
          char currentChar = sb.charAt(i);

          if (currentChar != 32  && currentChar != 47  && currentChar != 61  ) {
              counter++;
          }

        }

        System.out.printf("Travel Points: %d", counter);
    }
}
