package T08TextProcessing.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01ValidUserNamesSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         Arrays.stream(scanner.nextLine().split(", "))
                 .filter(e -> e.matches("[0-9a-zA-Z\\-_]{3,16}"))
                 .forEach(System.out::println);

    }
}
