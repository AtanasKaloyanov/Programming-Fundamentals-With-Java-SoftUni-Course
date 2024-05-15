package T06ObjectsAndClasses.Lab;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01RandomizeWords {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<String> list = readArray(scanner);

        // 2. Removing a random word from the list until the list becomes empty
        // via class Random
        Random random = new Random();
        while (!list.isEmpty()) {
            int randomIndex = random.nextInt(list.size());
            String randomWord = list.remove(randomIndex);
            System.out.println(randomWord);
        }
    }

    private static List<String> readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
    }
}
