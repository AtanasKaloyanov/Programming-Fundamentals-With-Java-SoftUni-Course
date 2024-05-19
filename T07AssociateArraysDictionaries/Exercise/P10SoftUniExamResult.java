package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P10SoftUniExamResult {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Filling the maps in a while cycle
        // participant result
        Map<String, Integer> pointsByParticipants = new LinkedHashMap<>();
        //language  solutions
        Map<String, Integer> solutionsByLanguage = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] currentArray = input.split("-");
            String currentGivenParticipant = currentArray[0];
            String currentGivenLanguage = currentArray[1];

            if (currentGivenLanguage.equals("banned")) {
                pointsByParticipants.remove(currentGivenParticipant);
                input = scanner.nextLine();
                continue;
            }

            int currentGivenPoints = Integer.parseInt(currentArray[2]);
            pointsByParticipants.putIfAbsent(currentGivenParticipant, currentGivenPoints);
            int currentPoints = pointsByParticipants.get(currentGivenParticipant);
            if (currentGivenPoints > currentPoints) {
                pointsByParticipants.put(currentGivenParticipant, currentGivenPoints);
            }

            solutionsByLanguage.putIfAbsent(currentGivenLanguage, 0);
            int newSolutionsNumber = solutionsByLanguage.get(currentGivenLanguage) + 1;
            solutionsByLanguage.put(currentGivenLanguage, newSolutionsNumber);

            input = scanner.nextLine();
        }

        // 3. Output printing:
        System.out.println("Results:");
        pointsByParticipants.forEach((key, value) -> System.out.printf("%s | %d\n", key, value));
        System.out.println("Submissions:");
        solutionsByLanguage.forEach((key, value) -> System.out.printf("%s - %d\n", key, value));
    }
}
