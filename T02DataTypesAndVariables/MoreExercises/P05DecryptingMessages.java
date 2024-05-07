package T02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class P05DecryptingMessages {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Adding the key to the current char and then the current char to the result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            currentChar += key;
            result.append(currentChar);
        }

        // 3. Output printing
        System.out.println(result);
    }
}
