package T08TextProcessing.Lab;

import java.util.Scanner;

public class P03Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ice
        //kicegiciceeb

        //kgb

        String removeWord = scanner.nextLine();
        String givenWord = scanner.nextLine();

        while (givenWord.contains(removeWord)) {
            givenWord = givenWord.replace(removeWord, "");
        }

        System.out.println(givenWord);


    }
}
