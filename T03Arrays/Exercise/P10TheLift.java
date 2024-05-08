package T03Arrays.Exercise;

import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;
import java.util.Scanner;

public class P10TheLift {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] array = createArray(scanner);

        // 2.
        for (int i = 0; i < array.length; i++) {
            int currentFreeSeats = 4 - array[i];
            if (people < currentFreeSeats) {
                array[i] = array[i] + people;
                System.out.println("The lift has empty spots!");
                System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));
                return;
            }

            array[i] = 4;
            people -= currentFreeSeats;
        }

        // 3. Output printing - 2 cases:
        if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
            System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));

        }
    }

    private static int[] createArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
