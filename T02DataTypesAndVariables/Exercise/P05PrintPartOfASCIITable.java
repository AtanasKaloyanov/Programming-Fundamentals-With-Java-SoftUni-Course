package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Find online more information about ASCII (American Standard Code for Information Interchange)
        // and write a program that prints part of the ASCII table of characters at the console.
        //On the first line of input, you will receive the char index you should start with, and on the
        //second line - the index of the last character you should print.

        int startNumber = Integer.parseInt(scanner.nextLine());
        int finalNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= finalNumber ; i++) {

            char currentChar = (char) i;
            System.out.print(currentChar + " ");

        }

    }
}
