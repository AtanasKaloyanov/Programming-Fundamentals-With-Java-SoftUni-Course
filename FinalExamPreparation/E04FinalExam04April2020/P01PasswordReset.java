package FinalExamPreparation.E04FinalExam04April2020;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] array = input.split(" ");
            String command = array[0];

            switch (command) {

                case "TakeOdd":

                    StringBuilder secondSb = new StringBuilder();

                    for (int i = 0; i < sb.length(); i++) {

                      if (i % 2 != 0) {
                          char currentChar = sb.charAt(i);
                          secondSb.append(currentChar);
                      }

                    }

                    sb = new StringBuilder(secondSb);
                    System.out.println(sb);

                    break;

                case "Cut":

                    int index = Integer.parseInt(array[1]);
                    int length = Integer.parseInt(array[2]);

                    sb.delete(index, index + length);
                    System.out.println(sb);

                    break;

                case "Substitute":

                    String oldString = array[1];
                    String newString = array[2];

                    if (sb.toString().contains(oldString)) {
                        sb.replace(0, sb.length(), sb.toString().replace(oldString, newString));
                        System.out.println(sb);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", sb);

    }
}
