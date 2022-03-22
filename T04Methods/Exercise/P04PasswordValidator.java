package T04Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (!charactersCounting(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!consistationCheck(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!digitsCounting(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (charactersCounting(password) && consistationCheck(password) && digitsCounting(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean charactersCounting(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean consistationCheck(String password) {

        password = password.toLowerCase();

        int counter = 0;

        for (int i = 0; i <= password.length() - 1; i++) {
            char currentChar = password.charAt(i);
            for (int j = 48; j <= 57; j++) {
                if (currentChar == j) {
                    counter++;
                }
            }

            for (int j = 97; j <= 122; j++) {
                if (currentChar == j) {
                    counter++;
                }
            }
        }
        if (counter == password.length()) {
            return true;
        }
        return false;
    }

    public static boolean digitsCounting(String password) {
        int counter = 0;
        for (int i = 0; i <= password.length() - 1; i++) {
            char currentChar = password.charAt(i);
            for (int j = 48; j <= 57; j++) {
                if (currentChar == j) {
                    counter++;
                }
            }
        }
        if (counter >= 2) {
            return true;
        }
        return false;
    }


}
