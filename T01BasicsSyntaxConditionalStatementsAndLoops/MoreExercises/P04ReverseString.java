package T01BasicsSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        // 2. Reversing the String
        System.out.println(sb.reverse());
    }
}
