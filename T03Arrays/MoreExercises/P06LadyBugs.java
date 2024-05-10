package T03Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] field = new int[n];
        int[] indices = arrayReading(scanner);

        // 2. Filling the field with ones (when the index is correct)
        for (int index : indices) {
            if (index >= 0 && index < n) {
                field[index] = 1;
            }
        }

        // 3. Commands reading
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] currentArray = input.split("\\s++");
            int currentIndex = Integer.parseInt(currentArray[0]);
            String currentDirection = currentArray[1];
            int currentFlyLength = Integer.parseInt(currentArray[2]);

            // 3.1. Check for invalid index or element zero on this index
            if (currentIndex < 0 || currentIndex >= n || field[currentIndex] == 0) {
                input = scanner.nextLine();
                continue;
            }

            // 3.2. Releasing the current field
            field[currentIndex] = 0;

            // 4. Command implementation
            switch (currentDirection) {
                case "right":
                    while (true) {
                        currentIndex += currentFlyLength;
                        if (currentIndex < 0 || currentIndex >= n) {
                            break;
                        }
                        int currentPosition = field[currentIndex];
                        if (currentPosition == 0) {
                            field[currentIndex] = 1;
                            break;
                        }
                    }
                    break;
                case "left":
                    while (true) {
                        currentIndex -= currentFlyLength;
                        if (currentIndex < 0 || currentIndex >= n) {
                            break;
                        }
                        int currentPosition = field[currentIndex];
                        if (currentPosition == 0) {
                            field[currentIndex] = 1;
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }

            input = scanner.nextLine();
        }

        // 5. Output printing
        System.out.println(Arrays.toString(field).replaceAll("[\\[\\],]", ""));
    }

    private static int[] arrayReading(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

/*
3
0 1
0 cat 1
 */