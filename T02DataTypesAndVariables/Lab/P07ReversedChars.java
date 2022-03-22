package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String thirdString = scanner.nextLine();

        System.out.printf("%s %s %s", thirdString, secondString, firstString);

    }
}
