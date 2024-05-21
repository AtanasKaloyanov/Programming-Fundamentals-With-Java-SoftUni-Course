package T08TextProcessing.Lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Output printing:
        String[] currentArray = input.split(" ");
        for (String currentString : currentArray) {
            int n = currentString.length();
            for (int i = 0; i < n; i++) {
                System.out.print(currentString);
            }
        }
    }
}
