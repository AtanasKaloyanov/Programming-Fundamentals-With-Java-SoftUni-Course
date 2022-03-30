package FinalExamPreparation.E04FinalExam04April2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String text = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {

                String matched = matcher.group();
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < matched.length(); j++) {
                    char currentChar = matched.charAt(j);

                    if (Character.isDigit(currentChar)) {
                        sb.append(currentChar);
                    }
                }
                if (sb.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", sb);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }



    }
}
