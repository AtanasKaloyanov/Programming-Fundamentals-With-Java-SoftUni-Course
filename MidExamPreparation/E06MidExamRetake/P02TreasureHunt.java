package MidExamPreparation.E06MidExamRetake;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tresureChest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = list.get(0);

            switch (command) {
                case "Loot":
                    for (int i = 1; i <= list.size() - 1; i++) {
                        String currentItem = list.get(i);
                        boolean doesExist = tresureChest.contains(currentItem);

                        if (!doesExist) {
                            tresureChest.add(0, currentItem);
                        }
                    }
                    break;

                case "Drop":
                    int index = Integer.parseInt(list.get(1));
                    if (index >= 0 && index <= tresureChest.size() - 1) {

                        String item = tresureChest.get(index);
                        tresureChest.remove(item);
                        tresureChest.add(tresureChest.size(), item);
                    }
                    break;

                case "Steal":
                    int count = Integer.parseInt(list.get(1));
                    if (count > tresureChest.size()) {
                        count = tresureChest.size();
                    }

                    int number = 1;
                    String stolenItems = "";

                    while (number <= count) {
                        String lastItem = tresureChest.get(tresureChest.size() - 1);
                        stolenItems = stolenItems + lastItem + " ";
                        tresureChest.remove(lastItem);
                        number++;
                    }

                    List<String> stolenList = Arrays.stream(stolenItems.split(" ")).collect(Collectors.toList());
                    Collections.reverse(stolenList);
                    System.out.println(stolenList.toString().replaceAll("[\\[\\]]", ""));
                    break;
            }

            input = scanner.nextLine();
        }

        if (tresureChest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            int itemsChars = 0;

            for (String currentItem : tresureChest) {
                for (int i = 0; i <= currentItem.length() - 1; i++) {
                    itemsChars++;
                }
            }
                System.out.printf("Average treasure gain: %.2f pirate credits.", itemsChars * 1.00 / tresureChest.size());

        }
    }
}
