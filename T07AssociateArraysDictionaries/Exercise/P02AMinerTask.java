package T07AssociateArraysDictionaries.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> recourceAndQuantityMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {

                String recource = input;

                if (!recourceAndQuantityMap.containsKey(recource)) {
                    int value = Integer.parseInt(scanner.nextLine());
                    recourceAndQuantityMap.put(recource, value);

                } else {
                    int currentValue = recourceAndQuantityMap.get(input);
                    int addingValue = Integer.parseInt(scanner.nextLine());

                    recourceAndQuantityMap.put(recource, currentValue + addingValue);
                }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : recourceAndQuantityMap.entrySet()) {

            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());

        }


        //gold
        //155
        //silver
        //10
        //copper
        //17
        //gold
        //15
        //stop

        // gold -> 155 + 15 = 170
        // silver -> 10
        // copper -> 17

        //gold -> 170
        //silver -> 10
        //copper -> 17



    }
}
