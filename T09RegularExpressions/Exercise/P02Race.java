package T09RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.lang.Integer.compare;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] participantsArray = scanner.nextLine().split(", ");

        String nameRegex = "[A-Za-z]";
        String digitRegex = "\\d{1}";

        Map<String, Integer> participantsAndResultsMap = new LinkedHashMap<>();

        for (int i = 0; i < participantsArray.length; i++) {
            participantsAndResultsMap.putIfAbsent(participantsArray[i], 0);
        }

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {

            Pattern namePattern = Pattern.compile(nameRegex);
            Pattern digitPattern = Pattern.compile(digitRegex);

            Matcher nameMatcher = namePattern.matcher(input);
            Matcher digitMatcher = digitPattern.matcher(input);

            StringBuilder sb = new StringBuilder();

            while (nameMatcher.find()) {
                sb.append(nameMatcher.group());
            }

            if (participantsAndResultsMap.containsKey(sb.toString())) {
                while (digitMatcher.find()) {
                    int currentInt = Integer.parseInt(digitMatcher.group());
                    participantsAndResultsMap.put(sb.toString(), participantsAndResultsMap.get(sb.toString()) + currentInt);
                }
            }

            input = scanner.nextLine();
        }

        List<String> sortedList = participantsAndResultsMap.entrySet().stream()
                .sorted((a, b) -> compare(b.getValue(), a.getValue()))
                .limit(3)
                .map(e -> e.getKey())
                .collect(Collectors.toList());

       

      /*  Map<String, Integer> newMap = participantsAndResultsMap.entrySet().stream()
                .sorted((a, b) -> compare(b.getValue(), a.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));
       */

        System.out.printf("1st place: %s%n", sortedList.get(0));
        System.out.printf("2nd place: %s%n", sortedList.get(1));
        System.out.printf("3rd place: %s", sortedList.get(2));

    }
}
// George, Peter, Bill, Tom
//G4e@55or%6g6!68e!!@  --> George --> 4 + 5 + 5 + 6 + 6 + 6 + 8 = 40
//R1@!3a$y4456@        --> Ray    --> Invalid
//B5@i@#123ll          --> Bill   --> 5 + 1 + 2 + 3 = 11
//G@e54o$r6ge#         --> 1. George --> 5 + 4 + 6 = 15   --> 15 + 40 = 55
//7P%et^#e5346r        --> 2. Peter  --> 7 + 5 + 3 + 4 + 6 = 25
//T$o553m&6            --> 3. Tom    --> 5 + 5 + 3 + 6 = 19
//end of race

//1st place: George
//2nd place: Peter
//3rd place: Tom




