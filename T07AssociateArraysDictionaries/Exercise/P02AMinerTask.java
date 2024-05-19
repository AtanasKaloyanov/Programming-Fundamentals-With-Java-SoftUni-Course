package T07AssociateArraysDictionaries.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Adding occurrences via map
        Map<String, Integer> map = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String currentText = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            map.putIfAbsent(currentText, 0);
            int currentOccurrences = map.get(currentText);
            map.put(currentText, currentOccurrences + quantity);
            input = scanner.nextLine();
        }

        // 3. Output printing
        map.forEach( (key, value) -> System.out.printf("%s -> %d\n", key, value));
    }
}
