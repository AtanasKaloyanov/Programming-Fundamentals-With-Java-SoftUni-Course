package T07AssociateArraysDictionaries.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P04WordFilterSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] wordsArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        for (String currentWord : wordsArray) {
            System.out.println(currentWord);
        }

    }
}
