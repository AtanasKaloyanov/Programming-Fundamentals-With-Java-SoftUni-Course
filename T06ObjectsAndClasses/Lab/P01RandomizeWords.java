package T06ObjectsAndClasses.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {

            Random random = new Random();

            int firstInt = random.nextInt(list.size());
            int secondInt = random.nextInt(list.size());

            String firstString = list.get(firstInt);
            String secondString = list.get(secondInt);

            list.set(firstInt, secondString);
            list.set(secondInt, firstString);
        }
        System.out.println(String.join(System.lineSeparator(), list));
    }
}
