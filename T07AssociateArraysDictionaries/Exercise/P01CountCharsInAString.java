package T07AssociateArraysDictionaries.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Occurrences adding
        Map<Character, Integer> occurrencesByChar = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != ' ') {
                occurrencesByChar.putIfAbsent(currentChar, 0);
                int currentOccurrences = occurrencesByChar.get(currentChar);
                occurrencesByChar.put(currentChar, currentOccurrences + 1);
            }
        }

        // 3. Output printing
        occurrencesByChar.forEach( (key, value) -> System.out.printf("%c -> %s\n", key, value));
    }
}
