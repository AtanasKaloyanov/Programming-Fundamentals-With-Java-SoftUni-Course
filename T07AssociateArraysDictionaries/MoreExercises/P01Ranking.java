package T07AssociateArraysDictionaries.MoreExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class P01Ranking {
    public static void main(String[] args) {
        // 1. Input rading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Adding the exams and the passwords in a map
        Map<String, String> passwordsByExams = new HashMap<>();

        while (!input.equals("end of contests")) {
            String[] currentArray = input.split(":");
            String currentExam = currentArray[0];
            String currentPass = currentArray[1];
            passwordsByExams.put(currentExam, currentPass);
            input = scanner.nextLine();
        }

        // 3. Receiving the participants with their scores
        //participant   exam     score
        Map<String, Map<String, Integer>> scoresByExamsMapByParticipants = new TreeMap<>();

        String input2 = scanner.nextLine();
        while (!input2.equals("end of submissions")) {
            String[] currentArray = input2.split("=>");
            String currentExam = currentArray[0];
            String currentPassword = currentArray[1];

            if (examValidations(passwordsByExams, currentExam, currentPassword)) {
                String currentParticipant = currentArray[2];
                int currentScore = Integer.parseInt(currentArray[3]);

                scoresByExamsMapByParticipants.putIfAbsent(currentParticipant, new HashMap<>());
                Map<String, Integer> scoreByExamMap = scoresByExamsMapByParticipants.get(currentParticipant);
                scoreByExamMap.putIfAbsent(currentExam, 0);

                int oldScore = scoreByExamMap.get(currentExam);

                if (currentScore > oldScore) {
                    scoreByExamMap.put(currentExam ,currentScore);
                    scoresByExamsMapByParticipants.put(currentParticipant, scoreByExamMap);
                }
            }
            input2 = scanner.nextLine();
        }

        // 3. Output printing
        scoresByExamsMapByParticipants.entrySet().stream()
                        .sorted( (entry1, entry2) -> {
                            Map<String, Integer> innerMap1 = entry1.getValue();
                            Map<String, Integer> innerMap2 = entry2.getValue();
                            int sum1 = innerMap1.values().stream().mapToInt(e -> e).sum();
                            int sum2 = innerMap2.values().stream().mapToInt(e -> e).sum();

                            return Integer.compare(sum2, sum1);
                        }).limit(1)
                        .forEach( (entry) -> {
                                String bestParticipant = entry.getKey();
                                int bestResult = entry.getValue().values().stream().mapToInt(i -> i).sum();
                                    System.out.printf("Best candidate is %s with total %d points.\n", bestParticipant, bestResult);
                                });

        System.out.println("Ranking:");
        scoresByExamsMapByParticipants.forEach( (participant, scoreByExamMap) -> {
            System.out.println(participant);
            scoreByExamMap.entrySet().stream()
                    .sorted( (entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                    .forEach( (entry) -> System.out.printf("#  %s -> %d\n", entry.getKey(), entry.getValue()));
        });
    }

    private static boolean examValidations(Map<String, String> passwordsByExams, String currentExam, String currentPassword) {
        return passwordsByExams.containsKey(currentExam) && passwordsByExams.get(currentExam).equals(currentPassword);
    }
}
