package T08TextProcessing.MoreExercise;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output printing in for cycle
        for (int i = 0; i < n; i++) {
            String currentLine = scanner.nextLine();
            int nameBeginIndex = currentLine.indexOf("@");
            int nameEndIndex = currentLine.indexOf("|"); // There is no escaping
            String name = currentLine.substring(nameBeginIndex + 1, nameEndIndex);

            int ageBeginIndex = currentLine.indexOf("#");
            int ageEndIndex = currentLine.indexOf("*");
            String age = currentLine.substring(ageBeginIndex + 1, ageEndIndex);

            System.out.printf("%s is %s years old.\n", name, age);
        }


    }
}
