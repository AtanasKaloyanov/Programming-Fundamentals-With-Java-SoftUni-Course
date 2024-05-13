package T05ListsArraysAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01ListManipulationBasics {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // 2. Command implementation
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] currentArray = input.split(" ");
            String currentCommand = currentArray[0];

            switch (currentCommand) {
                case "Add":
                    int addNumber = Integer.parseInt(currentArray[1]);
                    list.add(addNumber);
                    break;
                case "Remove":
                    int removeNumber = Integer.parseInt(currentArray[1]);
                    list.remove(Integer.valueOf(removeNumber));
                    break;
                case "RemoveAt":
                    int removeIndex = Integer.parseInt(currentArray[1]);
                    list.remove(removeIndex);
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

}
