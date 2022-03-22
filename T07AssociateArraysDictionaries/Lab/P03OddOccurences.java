package T07AssociateArraysDictionaries.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> givenList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Map<String, Integer> wordAndTimesMap = new LinkedHashMap<>();

        for (String word : givenList) {

            String currentWord = word.toLowerCase();

            if (!wordAndTimesMap.containsKey(currentWord)) {
                wordAndTimesMap.put(currentWord, 1);
            } else {
                int value = wordAndTimesMap.get(currentWord);
                wordAndTimesMap.put(currentWord, value + 1);
            }

        }

        List <String> printList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordAndTimesMap.entrySet()) {

            if (entry.getValue() % 2 != 0) {
                printList.add(entry.getKey());
            }
        }

        System.out.println(printList.toString().replaceAll("[\\[\\]]", ""));


        // Java C# PHP PHP JAVA C java

          // java - 3
          // c# - 1
          // php - 2
          // c - 1

           // java, c#, c
    }
}
