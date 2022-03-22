package T05ListsArraysAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List <String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            int something = Integer.parseInt(command.get(1));

            switch (command.get(0)) {
                case "Add":
              numbers.add(numbers.size()  , something);
                    break;
                case "Remove":
                 numbers.remove(Integer.valueOf(something));
                    break;
                case "RemoveAt":
                  numbers.remove(something);
                    break;
                case "Insert":
                  numbers.add(Integer.parseInt(command.get(2)), something);
                    break;

            }

            input = scanner.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }

    }
}
