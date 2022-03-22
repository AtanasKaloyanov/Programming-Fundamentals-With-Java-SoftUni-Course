package T05ListsArraysAdvanced.Exercise;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = list.get(0);

            if (command.equals("Delete")) {

                int deleteNumber = Integer.parseInt(list.get(1));

                while (numbers.contains(deleteNumber)) {
                    numbers.remove(Integer.valueOf(deleteNumber));
                }

            } else if (command.equals("Insert")) {

                int addingNumber = Integer.parseInt(list.get(1));
                int addingIndex = Integer.parseInt(list.get(2));

                numbers.add(addingIndex, addingNumber);

            }

            input = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
