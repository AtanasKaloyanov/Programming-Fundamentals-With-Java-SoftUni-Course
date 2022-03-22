package T07AssociateArraysDictionaries.Lab;

import java.text.DecimalFormat;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        Map <String, List<String> > wordAndSynonymsMap = new LinkedHashMap<>();

        for (int i = 1; i <=  numbers ; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordAndSynonymsMap.containsKey(word)) {

                wordAndSynonymsMap.put(word, new ArrayList<>());
                wordAndSynonymsMap.get(word).add(synonym);

            } else {
              wordAndSynonymsMap.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : wordAndSynonymsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue().toString().replaceAll("[\\[\\]]", ""));
            // ("[\\[\\],]", "")
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
