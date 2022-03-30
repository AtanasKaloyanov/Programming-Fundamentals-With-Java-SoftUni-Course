package ExamPreparation.E02FinalExam09August2020;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] data = input.split(":");
            String command = data[0];

            switch (command) {

                case "Add Stop":
                    int givenIndex = Integer.parseInt(data[1]);
                    String currentString = data[2];

                    if (givenIndex >= 0 && givenIndex <= sb.length()) {
                        sb.insert(givenIndex, currentString);
                    }

                    System.out.println(sb);

                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);

                    if (startIndex >= 0 && startIndex <= sb.length() && (endIndex >= 0 && endIndex < sb.length())) {
                       // sb.replace(startIndex, endIndex + 1, "");
                        sb.delete(startIndex, endIndex + 1);
                    }

                    System.out.println(sb);

                    break;

                case "Switch":
                    String oldString = data[1];
                    String newString = data[2];

                    sb.replace(0, sb.length(), sb.toString().replace(oldString, newString));

                    System.out.println(sb);

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", sb);

    }
}
