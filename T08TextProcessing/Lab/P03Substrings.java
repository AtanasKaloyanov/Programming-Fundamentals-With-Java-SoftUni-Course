package T08TextProcessing.Lab;

import java.util.Scanner;

public class P03Substrings {
    public static void main(String[] args) {
        // 1.Input reading
        Scanner scanner = new Scanner(System.in);
        String replaceString = scanner.nextLine();
        String input = scanner.nextLine();
        int index = input.indexOf(replaceString);

        // 2. Replacement
        while (index != -1) {
            input = input.replace(replaceString, "");
            index = input.indexOf(replaceString);
        }

        // 3. Output printing
        System.out.println(input);
    }
}
