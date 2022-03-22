package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P10SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Integer>> namesAndPointsMap = new LinkedHashMap<>();
        Map<String, Integer> languageAndNumbersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {

            if (input.contains("banned")) {

                String[] data = input.split("-");
                String name = data[0];

                namesAndPointsMap.remove(name);
            } else {

                String[] data = input.split("-");
                String name = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                namesAndPointsMap.putIfAbsent(name, new ArrayList<>());
                namesAndPointsMap.get(name).add(points);

                languageAndNumbersMap.putIfAbsent(language, 0);
                int currentValue = languageAndNumbersMap.get(language);
                languageAndNumbersMap.put(language, currentValue + 1);

            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        namesAndPointsMap.forEach((key, value) -> System.out.printf("%s | %d%n", key, value.stream().mapToInt(Integer::intValue).max().getAsInt()));
        System.out.println("Submissions:");
        languageAndNumbersMap.forEach((key, value) -> System.out.printf("%s - %d%n", key, value));
        //Peter-Java-84
        //George-C#-84
        //George-C#-70
        //Katy-C#-94
        //exam finished

        //Results:
        //Peter | 84
        //George | 84
        //Katy | 94

        //Submissions:
        //Java - 1
        //C# - 3


    }
}
