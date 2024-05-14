package T05ListsArraysAdvanced.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        // 2. Commands implementation
        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split(" ");
            String currentName = currentArray[0];
            String command = currentArray[2];

            if (command.equals("going!")) {
                if (!list.contains(currentName)) {
                    list.add(currentName);
                } else {
                    System.out.printf("%s is already in the list!\n", currentName);
                }
            } else {
                if (list.contains(currentName)) {
                    list.remove(currentName);
                } else {
                    System.out.printf("%s is not in the list!\n", currentName);
                }
            }
        }

        // 3. Output printing
        list.forEach(System.out::println);
    }
}
