package T07AssociateArraysDictionaries.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Map<String, Integer> wordAndNumberMap = new LinkedHashMap<>();

        for (String currentWord : words) {

            if (currentWord.length() % 2 == 0) {
                wordAndNumberMap.put(currentWord, currentWord.length());
            }

        }

        for (Map.Entry<String, Integer> entry : wordAndNumberMap.entrySet()) {

            System.out.println(entry.getKey());

        }


        // kiwi orange banana apple

        // kiwi - 4
        // orange - 6
        // banana - 6
        // apple - 5

        //kiwi
        //orange
        //banana
    }
}
