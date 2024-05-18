package T07AssociateArraysDictionaries.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P04WordFilter {
    public static void main(String[] args) {
        // 1. Input reading, filtering and output printing
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" "))
                .filter( (word) -> word.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
