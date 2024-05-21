package T08TextProcessing.Lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Outpu printing via StringBuilder
        while (!input.equals("end")) {
            StringBuilder reversedString = new StringBuilder(input).reverse();
            System.out.printf("%s = %s\n", input, reversedString);
            input = scanner.nextLine();
        }
    }
}
