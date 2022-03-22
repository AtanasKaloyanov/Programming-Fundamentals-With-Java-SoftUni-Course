package T04Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();



        while (!input.equals("END")) {

            String[] array = input.split("");

            String firstString = "";
            for (int i = 0; i <= array.length - 1 ; i++) {
                String currentString = array[i];
                firstString = firstString + currentString;
            }

            String secondString = "";
            for (int i = array.length - 1; i >= 0; i--) {
                String lastString = array[i];
                secondString = secondString + lastString;
            }

            if (firstString.equals(secondString)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }

    }
}
