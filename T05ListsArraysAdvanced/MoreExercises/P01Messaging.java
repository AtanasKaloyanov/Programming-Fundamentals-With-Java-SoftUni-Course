package T05ListsArraysAdvanced.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readList(scanner);
        String text = scanner.nextLine();
        
        // 2. Removing characters
        StringBuilder sb = new StringBuilder();
        for (Integer number : numbers) {
            String numberAsText = String.valueOf(number);
            int index = getSum(numberAsText);
            index = indexComputation(text, index);
            char charForRemoving = text.charAt(index);
            sb.append(charForRemoving);
            text = text.substring(0, index) + text.substring(index + 1);
        }

        // 3. Output printing
        System.out.println(sb);
    }

    private static int indexComputation(String text, int index) {
        while (index >= text.length()) {
            index -= text.length();
        }
        return index;
    }

    private static int getSum(String numberAsText) {
        int sum = 0;
        for (int i = 0; i < numberAsText.length(); i++) {
            char currentChar = numberAsText.charAt(i);
            int currentDigit = Integer.parseInt(String.valueOf(currentChar));
            sum += currentDigit;
        }
        return sum;
    }

    private static List<Integer> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
