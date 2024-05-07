package T02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. For cycle
        boolean isBalanced = true;
        boolean open = false;
        for (int i = 0; i < n; i++) {
            String currentInput = scanner.nextLine();
            if (currentInput.length() == 1) {
                char currentChar = currentInput.charAt(0);
                if (currentChar == 40 && !open) {
                     open = true;
                     isBalanced = false;
                } else if (currentChar == 40) {
                    break;
                } else if (currentChar == 41 && open) {
                    isBalanced = true;
                    open = false;
                } else if (currentChar == 41) {
                    isBalanced = false;
                    break;
                }
            }
        }

        // 3. Output printing - 2 cases:
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
