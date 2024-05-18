package T07AssociateArraysDictionaries.Lab;

import java.util.*;

public class P03OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        // 2. Finding the occurrences of the words via a map
        Map<String, Integer> wordsByOccurrences = new LinkedHashMap<>();
        for (String word : array) {
            word = word.toLowerCase();
            wordsByOccurrences.putIfAbsent(word, 0);
            int currentOcc = wordsByOccurrences.get(word);
            wordsByOccurrences.put(word, currentOcc + 1);
        }

        // 3. Output printing using a filter function
        List<String> result = new ArrayList<>();
        wordsByOccurrences.entrySet().stream()
                .filter( (entry) -> entry.getValue() % 2 != 0)
                .forEach( (entry) -> result.add(entry.getKey()));

        System.out.println(result.toString().replaceAll("[\\[\\]]", ""));
    }
}
