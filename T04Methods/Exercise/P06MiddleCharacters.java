package T04Methods.Exercise;
import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Output printing
        printOutput(input);
    }

    private static void printOutput(String text) {
        int length = text.length();
        int middleIndex = length / 2;
        if (length % 2 == 0) {
            int middleIndex2 = length / 2 - 1;
            System.out.println(text.charAt(middleIndex2) + "" + text.charAt(middleIndex));
            return;
        }
        System.out.println(text.charAt(middleIndex));
    }
}
