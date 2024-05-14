package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        // 1. Input reading as List<String>
        Scanner scanner = new Scanner(System.in);
        List<String> list = listReading(scanner);

        // 2. Reversing
        Collections.reverse(list);

        // 3. String manipulation
        String result = list.toString()
                .replaceAll("[\\[\\],]", "")
                .trim()
                .replaceAll("\\s++", " ");

        // 4. Output printing
        System.out.println(result);
    }

    private static List<String> listReading(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
    }
}

