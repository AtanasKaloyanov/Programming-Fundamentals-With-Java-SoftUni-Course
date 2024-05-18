package T07AssociateArraysDictionaries.Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Finding the synonyms via a map
        Map<String, List<String>> wordsBySynonymsList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String currentWord = scanner.nextLine();
            String currentSynonym = scanner.nextLine();
            wordsBySynonymsList.putIfAbsent(currentWord, new ArrayList<>());
            wordsBySynonymsList.get(currentWord).add(currentSynonym);
        }

        // 3. Output printing
        wordsBySynonymsList.forEach( (key, value) -> {
            String printingValue = value.toString().replaceAll("[\\[\\]]", "");
            System.out.printf("%s - %s\n", key, printingValue);
        });
    }
}
