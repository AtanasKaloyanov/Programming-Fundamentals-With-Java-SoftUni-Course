package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints whether a given character is upper-case or lower-case.

        String givenString = scanner.nextLine();
        int integer = givenString.charAt(0);

        if (integer >= 65 && integer <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }


    }
}
