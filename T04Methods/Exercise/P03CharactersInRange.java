package T04Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firsCharacter = scanner.nextLine().charAt(0);
        char secondCharacter = scanner.nextLine().charAt(0);

        if (firsCharacter < secondCharacter) {
            printCharacters(firsCharacter, secondCharacter);
        } else {
            secondPrint(firsCharacter, secondCharacter);
        }
    }

    public static void printCharacters(char firsCharacter, char secondCharacter) {
        for (int i = firsCharacter; i <= secondCharacter; i++) {
            if (i != firsCharacter && i != secondCharacter) {
                System.out.print((char) i + " ");
            }
        }
    }

    public static void secondPrint(char firsCharacter, char secondCharacter) {
        for (int i = secondCharacter; i <= firsCharacter; i++) {
            if (i != firsCharacter && i != secondCharacter) {
                System.out.print((char) i + " ");
            }
        }
    }

}
