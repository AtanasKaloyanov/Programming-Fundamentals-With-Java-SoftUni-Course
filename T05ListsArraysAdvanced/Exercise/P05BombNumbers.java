package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> bombAndPower = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int bomb = bombAndPower.get(0);
        int power = bombAndPower.get(1);

        while (numbers.contains(bomb)) {
            int bombPosition = numbers.indexOf(bomb);

            int leftBounder = Math.max(0, bombPosition - power);
            int rigthBounder = Math.min(numbers.size() - 1, bombPosition + power);

            for (int i = rigthBounder; i >= leftBounder; i--) {
                numbers.remove(i);

            }
        }
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}


