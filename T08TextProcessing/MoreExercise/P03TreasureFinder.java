package T08TextProcessing.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readNumbers(scanner);

        // 2. Messages decrypting:
        String message = scanner.nextLine();
        while (!message.equals("find")) {
            String currentMessage = decrypt(message, numbers);
            int beginTreasureIndex = currentMessage.indexOf("&");
            String lastString = currentMessage.substring(beginTreasureIndex + 1);
            int toBeginLength = currentMessage.substring(0, beginTreasureIndex + 1).length();
            int endTreasureIndex = lastString.indexOf("&") + toBeginLength;
            String currentTreasure = currentMessage.substring(beginTreasureIndex + 1, endTreasureIndex);
            String currentPlace = currentMessage.substring(currentMessage.indexOf("<") + 1, currentMessage.indexOf(">"));
            System.out.printf("Found %s at %s\n", currentTreasure, currentPlace);
            message = scanner.nextLine();
        }
    }

    private static int[] readNumbers(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static String decrypt(String message, int[] numbers) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        char[] array = message.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int currentNumber = numbers[index];
            char currentChar = array[i];
            currentChar -= currentNumber;
            sb.append(currentChar);

            index++;
            if (index == numbers.length) {
                index = 0;
            }
        }

        return sb.toString();
    }
}
