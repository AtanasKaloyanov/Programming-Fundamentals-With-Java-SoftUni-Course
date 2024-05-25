package T09RegularExpressions.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P02RaceSecondSolution {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        Set<String> participants = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toSet());

        // 2. Adding the information into 2 variables, checking if the information is consisted in a Set
        // then adding the information into a map
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            int currentDistance = 0;
            StringBuilder currentName = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (Character.isDigit(currentChar)) {
                    currentDistance += Integer.parseInt(String.valueOf(currentChar));
                } else if (Character.isLetter(currentChar)) {
                    currentName.append(currentChar);
                }
            }

            if (participants.contains(currentName.toString())) {
                map.put(currentDistance, currentName.toString());
            }

            input = scanner.nextLine();
        }

        // 3. Output printing:
        List<String> winners = map.values().stream()
                .limit(3)
                .toList();

        System.out.printf("1st place: %s\n", winners.get(0));
        System.out.printf("2nd place: %s\n", winners.get(1));
        System.out.printf("3rd place: %s", winners.get(2));
    }
}
