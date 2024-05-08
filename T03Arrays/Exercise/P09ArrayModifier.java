package T03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
          // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray(scanner);

        // 2. Commands implementation
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] currentArray = input.split(" ");
            String command = currentArray[0];
            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(currentArray[1]);
                    int index2 = Integer.parseInt(currentArray[2]);
                    // switching elements via temp variable
                    int temp = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temp;
                    break;
                case "multiply":
                    int firstIndex = Integer.parseInt(currentArray[1]);
                    int secondIndex = Integer.parseInt(currentArray[2]);

                    array[firstIndex] = array[firstIndex] * array[secondIndex];
                    break;
                case "decrease":
                    for (int i = 0; i < array.length; i++) {
                        array[i] -= 1;
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.println(Arrays.toString(array).replaceAll("[\\[\\]]", ""));
    }

    private static int[] createArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
