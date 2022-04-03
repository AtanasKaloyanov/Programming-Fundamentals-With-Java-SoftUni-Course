package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MassageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= number ; i++) {

            String regex = "!(?<alfa>[A-Z][a-z]{2,})!:(?<message>\\[[A-Za-z]{8,}\\])";
            String text = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            Pattern pattern2 = Pattern.compile(regex);
            Matcher matcher2 = pattern2.matcher(text);

            if (!matcher.find()) {
                System.out.println("The message is invalid");
            }

            while (matcher2.find()) {
                String example = matcher2.group("message");
                String newString = example.substring(1, example.length() - 1);

                List <Integer> list = new ArrayList<>();

                for (int j = 0; j < newString.length() ; j++) {
                    char currentChar = newString.charAt(j);
                    int number2 = (int) currentChar;
                    list.add(number2);
                }

                System.out.printf("%s: ", matcher2.group("alfa"));
             System.out.printf("%s%n", list.toString().replaceAll("[\\[\\],]", ""));
            }

        }
    }
}
