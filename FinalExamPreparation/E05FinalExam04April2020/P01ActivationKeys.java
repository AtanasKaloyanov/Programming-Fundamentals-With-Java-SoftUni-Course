package FinalExamPreparation.E05FinalExam04April2020;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {

            String[] array = input.split(">>>");
            String command = array[0];

            switch (command) {

                case "Contains":
                    String substring = array[1];

                    if (sb.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", sb, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":

                    String upperOrLower = array[1];
                    int startIndex = Integer.parseInt(array[2]);
                    int endIndex = Integer.parseInt(array[3]);

                    if (upperOrLower.contains("Upper")) {

                        for (int i = startIndex; i < endIndex; i++) {

                            char currentChar = sb.charAt(i);
                            if (currentChar >= 97 && currentChar <= 122) {
                                currentChar = Character.toUpperCase(currentChar);
                            }
                            sb.setCharAt(i, currentChar);
                        }

                    } else {
                        for (int i = startIndex; i < endIndex; i++) {

                            char currentChar = sb.charAt(i);
                            if (currentChar >= 65 && currentChar <= 90) {
                                currentChar = Character.toLowerCase(currentChar);
                            }
                            sb.setCharAt(i, currentChar);
                        }
                    }

                    System.out.println(sb);

                    break;

                case "Slice":
                    int start = Integer.parseInt(array[1]);
                    int end = Integer.parseInt(array[2]);

                    sb.delete(start, end);
                    System.out.println(sb);
                    break;

            }

            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", sb);
    }
}

