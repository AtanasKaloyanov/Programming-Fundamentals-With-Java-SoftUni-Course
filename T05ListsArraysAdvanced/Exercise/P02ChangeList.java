package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = readArray(scanner);

        // 2. Commands implementation
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] currentArray = input.split(" ");
            String command = currentArray[0];

            switch (command) {
                case "Delete":
                    int removeNumber = Integer.parseInt(currentArray[1]);
                    list.removeIf( (element) -> element == removeNumber);
                    break;
                case "Insert":
                    int insertNumber = Integer.parseInt(currentArray[1]);
                    int insertIndex = Integer.parseInt(currentArray[2]);
                    list.add(insertIndex, insertNumber);
                    break;

            }
            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));

    }

    private static List<Integer> readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
