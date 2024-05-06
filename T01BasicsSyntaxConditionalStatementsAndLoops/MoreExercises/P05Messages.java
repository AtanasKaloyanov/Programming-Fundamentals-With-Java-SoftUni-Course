package T01BasicsSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        // 2. Computation of the current char via for cycle. There are 4 possibilities
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String currentInput = scanner.nextLine();
            int firstDigit = Integer.parseInt(String.valueOf(currentInput.charAt(0)));

            int ASCCIINumber = 0;
            if (firstDigit == 1) {
                continue;
            } else if (firstDigit >= 2 && firstDigit <= 7) {
                ASCCIINumber = (firstDigit - 2) * 3 + 97;
            } else if (firstDigit == 8 || firstDigit == 9) {
                ASCCIINumber = ((firstDigit - 2) * 3 + 1) + 97;
            } else if (firstDigit == 0) {
                for (int j = 0; j < currentInput.length(); j++) {
                    result.append(" ");
                }
                continue;
            }

            int add = currentInput.length();
            ASCCIINumber += add - 1;
            char symbol = (char) ASCCIINumber;
            result.append(symbol);
        }

        // 3. Output printing
        System.out.println(result);


        // 2 -> a -> 97
        // 3 -> d -> 100
        // 4 -> g -> 103
        // 5 -> j -> 106
        // 6 -> m -> 109
        // 7 -> p -> 112
        // 8 -> t -> 116
        // 9 -> w -> 119
    }
}
