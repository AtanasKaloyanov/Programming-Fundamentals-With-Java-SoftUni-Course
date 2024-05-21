package T08TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(", ");
        String currentLine = scanner.nextLine();

        // 2. Replace via replaceAll() method
        for (String replaceWord : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < replaceWord.length(); i++) {
                sb.append("*");
            }
            currentLine = currentLine.replaceAll(replaceWord, sb.toString());
        }

        // 3. Output printing:
        System.out.println(currentLine);
    }
}
