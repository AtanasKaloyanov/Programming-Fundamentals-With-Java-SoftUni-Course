package T04Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);

        // 2. Begin and end calculations
        int start = Math.min(char1, char2);
        int end = Math.max(char1, char2);

        // 3. Result printing
        for (int i = start + 1; i < end; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + " ");
        }

    }
}
