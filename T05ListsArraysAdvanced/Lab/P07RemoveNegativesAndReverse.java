package T05ListsArraysAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List <Integer> numbers = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < 0) {
                numbers.remove(numbers.get(i));
                i--;
            }
        }
        Collections.reverse(numbers);

        if (numbers.size() == 0) {
            System.out.println("empty");
        } else {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}
