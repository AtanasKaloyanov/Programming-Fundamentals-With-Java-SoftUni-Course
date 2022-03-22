package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
                           // Mike, John, Eddie
        //Blacklist Mike  // Blacklisted, John, Eddie
        //Error 0         // Blacklisted, John, Eddie
                           //Blacklisted, John, Eddie

        String input = scanner.nextLine();
        int blackListCounter = 0;
        int lostCounter = 0;

        while (!input.equals("Report")) {

            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = list.get(0);

            switch (command) {
                case "Blacklist":
                    String currentName = list.get(1);

                    boolean doesExist = names.contains(currentName);

                    if (doesExist) {
                        int indexName = names.indexOf(currentName);
                        String changedName = "Blacklisted";
                        names.set(indexName, changedName);
                        System.out.printf("%s was blacklisted.%n", currentName);
                        blackListCounter++;

                    } else {
                        System.out.printf("%s was not found.%n", currentName);
                    }

                    break;

                case "Error":
                    int index = Integer.parseInt(list.get(1));

                    if (index >= 0 && index <= names.size() - 1) {
                        String currentName2 = names.get(index);
                        String changedName2 = "Lost";

                        if (!currentName2.equals("Blacklisted") && !currentName2.equals("Lost")) {
                            names.set(index, changedName2);
                            System.out.printf("%s was lost due to an error.%n", currentName2);
                            lostCounter++;

                        }
                    }
                    break;

                case "Change":
                    int index2 = Integer.parseInt(list.get(1));
                    String newName = list.get(2);

                    if (index2 >= 0 && index2 <= names.size() - 1) {
                        String currentName2 = names.get(index2);
                        names.set(index2, newName);
                        System.out.printf("%s changed his username to %s.%n", currentName2, newName);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blackListCounter);
        System.out.printf("Lost names: %d%n", lostCounter);
        System.out.println(names.toString().replaceAll("[\\[\\],]", "")
                .replaceAll(",", ""));

    }
}
