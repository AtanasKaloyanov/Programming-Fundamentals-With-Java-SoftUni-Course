package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().charAt(0);

        // 2. Output printing - 2 cases
        if (Character.isUpperCase(input)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
