package MidExamPreparation.E05MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            List<String> list = Arrays.stream(input.split(" - ")).collect(Collectors.toList());
            String command = list.get(0);

            switch (command) {

                case "Collect":
                    String item = list.get(1);
                    boolean doesExist = inventory.contains(item);

                    if (!doesExist) {
                        inventory.add(inventory.size(), item);
                    }
                    break;

                case "Drop":
                    String item2 = list.get(1);
                    boolean doesExist2 = inventory.contains(item2);

                    if (doesExist2) {
                        inventory.remove(item2);
                    }
                    break;

                case "Combine Items":

                    String string = list.get(1);
                    List<String> secondList = Arrays.stream(string.split(":")).collect(Collectors.toList());
                    String oldItem = secondList.get(0);
                    String newItem = secondList.get(1);
                    boolean doesExist3 = inventory.contains(oldItem);

                    if (doesExist3) {
                        int index = inventory.indexOf(oldItem);
                        inventory.add(index + 1, newItem);
                    }
                    break;

                case "Renew":
                    String item3 = list.get(1);
                    boolean doesExist4 = inventory.contains(item3);

                    if (doesExist4) {
                        inventory.remove(item3);
                        inventory.add(inventory.size(), item3);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(inventory.toString().replaceAll("[\\[\\]]", ""));
    }
}
