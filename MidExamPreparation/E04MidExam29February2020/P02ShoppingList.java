package MidExamPreparation.E04MidExam29February2020;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        // първоначален лист -                        Milk!Pepper!Salt!Water!Banana
        // команда - Urgent Salt                      Milk Pepper Salt Water Banana .
        // команда - Unnecessary Grapes               Milk Pepper Salt Water Banana .
        //команда - Correct Pepper Onion              Milk Pepper Salt Water Banana
        //команда - Rearrange Grapes                  Milk Onion  Salt Water Banana
        //команда - Correct Tomatoes Potatoes         Milk Onion  Salt Water Banana
        //команда - Go Shopping!                      Milk Onion  Salt Water Banana

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = list.get(0);
            String item = list.get(1);

            int index = products.indexOf(item);

            switch (command) {
                case "Urgent":

                    boolean doesExist = products.contains(item);

                    if (!doesExist) {
                        products.add(0, item);
                    }

                    break;

                case "Unnecessary":

                    boolean doesExist2 = products.contains(item);
                    if (doesExist2) {
                        products.remove(item);
                    }
                    break;

                case "Correct":

                    String newItem = list.get(2);
                    boolean doesExist3 = products.contains(item);

                    if (doesExist3) {
                        products.set(index, newItem);
                    }

                    break;

                case "Rearrange":
                    boolean doesExist4 = products.contains(item);

                    if (doesExist4) {
                        products.remove(item);
                        products.add(products.size(), item);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(products.toString().replaceAll("[\\[\\]]", ""));

    }
}
