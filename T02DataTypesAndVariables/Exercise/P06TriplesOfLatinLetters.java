package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // + 96

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i <= number + 96 ; i++) {
            char firstChar = (char) + i;

            for (int j = 97; j <= number + 96 ; j++) {
                char secondChar = (char) + j;

                for (int k = 97; k <= number + 96 ; k++) {
                    char thirdChar = (char) + k;

                    System.out.printf("%c%c%c%n",i, j, k);
                }
            }
        }


    }
}
