package T07AssociateArraysDictionaries.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Map<Character, Integer> charAndNumberMap = new LinkedHashMap<>();

        for (String currentWord : words) {
            for (int i = 0; i <= currentWord.length() - 1; i++) {

                char currentChar = currentWord.charAt(i);

                if (!charAndNumberMap.containsKey(currentChar)) {
                    charAndNumberMap.put(currentChar, 1);
                } else {
                    int value = charAndNumberMap.get(currentChar);
                    charAndNumberMap.put(currentChar, value + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : charAndNumberMap.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }


        // text text text

        // text : t -> 2
        //        e -> 1
        //        x -> 1

        // text : t -> 2
        //        e -> 1
        //        x -> 1

        // text : t -> 2
        //        e -> 1
        //        x -> 1

        // t -> 6
        // e -> 3
        // x -> 3


    }
}
