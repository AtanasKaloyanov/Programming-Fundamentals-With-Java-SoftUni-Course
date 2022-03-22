package T07AssociateArraysDictionaries.Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordAndSynonymsMap = new LinkedHashMap<>();

        for (int i = 1; i <= number ; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordAndSynonymsMap.putIfAbsent(word, new ArrayList<>());
            wordAndSynonymsMap.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : wordAndSynonymsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }


        //Input:          Output:

            //                Key:   Value:
            // 3              cute - adorable, charming
            //cute            smart - clever
            //adorable
            //cute
            //charming
            //smart
            //clever


    }
}
