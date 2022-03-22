package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads 3 lines of input. On each line, you get a single character.
        // Combine all the characters into one string and print it on the console.


        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String thirdInput = scanner.nextLine();

        System.out.printf("%s%s%s", firstInput, secondInput, thirdInput);


    }
}
