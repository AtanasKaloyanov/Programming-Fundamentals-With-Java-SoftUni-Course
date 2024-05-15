package T05ListsArraysAdvanced.MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        List<Integer> list = readList(scanner);
        String numbersAsStrings = list.toString().replaceAll("[\\[\\],]", "");
        List<Integer> temp = readTemp(numbersAsStrings);

        // 2. Reducing the number in the list with the
        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int subtractNumber = Integer.parseInt(input);
            for (int i = 0; i < list.size(); i++) {
                int currentNumber = list.get(i);
                int setNumber = currentNumber - subtractNumber;
                // 2.1  2 cases: the current number is greater than the subtract number and the opposite
                if (setNumber <= 0) {
                    int initialNumber = temp.get(i);
                    int costs = initialNumber * 3;

                    // 2.2. Costs check
                    if (costs > sum) {
                        list.remove(i);
                        temp.remove(i);
                        i--;
                    } else {
                        sum -= costs;
                        list.set(i, initialNumber);
                    }

                } else {
                    list.set(i, setNumber);
                }
            }
            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", sum);
    }

    private static List<Integer> readTemp(String numbersAsStrings) {
        return Arrays.stream(numbersAsStrings.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static List<Integer> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}

/*
Inpup 1:
1000
58 65 33

11 12 18 10

       58 65 33
11 ->  47 54 22         1000
12 ->  35 42 10         1000
18 ->  17 24 33         901     1000 - (3 * 33)
10 ->  7  14 23         901

Output 1:
7 14 23   /   901.00

Input 2:

154
55 111 3 5 8 50

2 50 8 23 1

           55 111 3 5 8 50    154
2    ->    53 109 1 3 6 48    154
50   ->    3  59  3 5 8 X     106         154 - 3 * 3 = 145   /  145 - 5 * 3 = 130    /  130 - 3 * 8 =  106     /
8    ->    X  51  3 5 8                   106 - 3 * 3 = 97    /  97 - 5 * 3 = 82      /   82 - 3 * 8 =  58
23   ->       28  3 5 8                    58  - 3 * 3 = 49    /  49 - 5 * 3 = 34     /   34 - 3 * 8 = 10
1             27  2 5 7

Output 2:
27 2 4 7     /   10.00
 */
