package T07AssociateArraysDictionaries.MoreExercises;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class P02Judge {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Adding information into 2 maps. Every of them has inner map as a value.
        //   exam    participant score
        Map<String, Map<String, Integer>> participantsByScoresMapsByExams = new LinkedHashMap<>();

        //participant   exam     score
        Map<String, Map<String, Integer>> scoresByExamsMapsByParticipants = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String[] currentArray = input.split(" -> ");
            String currentParticipant = currentArray[0];
            String currentExam = currentArray[1];
            int currentScore = Integer.parseInt(currentArray[2]);

            // 2.1. first map adding - participantsByScoresMapsByExams
            participantsByScoresMapsByExams.putIfAbsent(currentExam, new LinkedHashMap<>());
            Map<String, Integer> currentScoresByParticipants = participantsByScoresMapsByExams.get(currentExam);
            currentScoresByParticipants.putIfAbsent(currentParticipant, 0);
            int oldScore = currentScoresByParticipants.get(currentParticipant);

            if (currentScore > oldScore) {
                currentScoresByParticipants.put(currentParticipant, currentScore);
                participantsByScoresMapsByExams.put(currentExam, currentScoresByParticipants);
            }

            // 2.2. second map adding - scoresByExamsMapByParticipants
            scoresByExamsMapsByParticipants.putIfAbsent(currentParticipant, new LinkedHashMap<>());
            Map<String, Integer> currentScoresByExams = scoresByExamsMapsByParticipants.get(currentParticipant);
            currentScoresByExams.putIfAbsent(currentExam, 0);
            int oldResult = currentScoresByExams.get(currentExam);

            if (currentScore > oldScore) {
                currentScoresByExams.put(currentExam, currentScore);
                scoresByExamsMapsByParticipants.put(currentParticipant, currentScoresByExams);
            }

            input = scanner.nextLine();
        }
        // 3. Output printing - 2 printings:
        // 3.1. Printing 1:
        participantsByScoresMapsByExams.forEach((exam, participantsByScoresMap) -> {
            System.out.printf("%s: %d participants\n", exam, participantsByScoresMap.size());
            AtomicInteger number = new AtomicInteger(1);
            participantsByScoresMap.entrySet().stream()
                    .sorted((e1, e2) -> {
                            int result = Integer.compare(e2.getValue(), e1.getValue());
                            if (result == 0) {
                                result = e1.getKey().compareTo(e2.getKey());
                            }

                            return result;
                    })
                    .forEach((entry) -> {
                        int currentNumeration = number.getAndIncrement();
                        String currentParticipant = entry.getKey();
                        int currentResult = entry.getValue();
                        System.out.printf("%d. %s <::> %d\n", currentNumeration, currentParticipant, currentResult);
                    });
        });

        // 3.2. Printing 2:
        System.out.println("Individual standings:");
        AtomicInteger num = new AtomicInteger(1);
        scoresByExamsMapsByParticipants.entrySet().stream()
                .sorted( (entry1, entry2) -> {
                    Map<String, Integer> currentScoreByExam1 = entry1.getValue();
                    int currentResult1 = getSum(currentScoreByExam1);
                    Map<String, Integer> currentScoreByExam2 = entry2.getValue();
                    int currentResult2 = getSum(currentScoreByExam2);

                    int result =  Integer.compare(currentResult2, currentResult1);
                    if (result == 0) {
                        result = entry1.getKey().compareTo(entry2.getKey());
                    }
                    return result;
                }).forEach( (entry) -> {
                    int currentNum = num.getAndIncrement();
                    String currentParticipant = entry.getKey();
                    Map<String, Integer> currentScoreByExam = entry.getValue();
                    int currentResult = getSum(currentScoreByExam);
                    System.out.printf("%d. %s -> %d\n", currentNum, currentParticipant, currentResult);
                });
    }

    private static int getSum(Map<String, Integer> currentScoreByExam1) {
        return currentScoreByExam1.values().stream()
                .mapToInt(e -> e).sum();
    }
}
