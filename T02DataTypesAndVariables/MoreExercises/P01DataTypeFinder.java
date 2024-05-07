package T02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String currentType = "";

        // 2. While cycle
        while (!input.equals("END")) {
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                currentType = "boolean";
            } else if (input.length() == 1) {
                char currentChar = input.charAt(0);
                if (currentChar >= 48 && currentChar <= 57) {
                    currentType = "integer";
                } else {
                    currentType = "character";
                }
            } else if (input.contains(".")) {
                boolean isString = false;
                for (int i = 0; i < input.length(); i++) {
                    char currentChar = input.charAt(i);
                    boolean firstCond =  currentChar >= 48 && currentChar <= 57;
                    boolean secondCond = currentChar == 45 && i == 0;
                    boolean thirdCond = currentChar == 46 && i != 0 && i != input.length() - 1;
                    if (!firstCond && !secondCond && !thirdCond) {
                        isString = true;
                        break;
                    }
                }
                if (isString) {
                    currentType = "string";
                } else {
                    currentType = "floating point";
                }
            } else  {
                boolean isString = false;
                for (int i = 0; i < input.length(); i++) {
                    char currentChar = input.charAt(i);
                    boolean firstCond =  currentChar >= 48 && currentChar <= 57;
                    boolean secondCond = currentChar == 45 && i == 0;
                    if (!firstCond && !secondCond) {
                        isString = true;
                        break;
                    }
                }
                if (isString) {
                    currentType = "string";
                } else {
                    currentType = "integer";
                }
            }
            System.out.printf("%s is %s type\n", input, currentType);
            input = scanner.nextLine();
        }
    }
}
