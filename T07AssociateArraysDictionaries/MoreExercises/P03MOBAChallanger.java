package T07AssociateArraysDictionaries.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03MOBAChallanger {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Adding information in a map that has an inner map as value. There are 2 commands:
        //  partic.    position points
        Map<String, Map<String, Integer>> pointsByPositionsMapsByParticipants = new LinkedHashMap<>();

        while (!input.equals("Season end")) {
            String[] currentArray;
            // 2.1. Command 1 implementation
            if (input.contains("->")) {
                currentArray = input.split(" -> ");
                String currentParticipant = currentArray[0];
                String currentPosition = currentArray[1];
                int currentPoints = Integer.parseInt(currentArray[2]);

                pointsByPositionsMapsByParticipants.putIfAbsent(currentParticipant, new LinkedHashMap<>());
                Map<String, Integer> currentScoresByPositions = pointsByPositionsMapsByParticipants.get(currentParticipant);
                currentScoresByPositions.putIfAbsent(currentPosition, 0);
                int oldPoints = currentScoresByPositions.get(currentPosition);

                if (currentPoints > oldPoints) {
                    currentScoresByPositions.put(currentPosition, currentPoints);
                    pointsByPositionsMapsByParticipants.put(currentParticipant, currentScoresByPositions);
                }
                // 2.2. Command 2 implementation
            } else {
                currentArray = input.split(" vs ");
                String currentParticipant = currentArray[0];
                String currentPretender = currentArray[1];

                Map<String, Integer> pointsByPositions1 = pointsByPositionsMapsByParticipants.get(currentParticipant);
                Map<String, Integer> pointsByPositions2 = pointsByPositionsMapsByParticipants.get(currentPretender);
                boolean isRemoved = false;

                if (pointsByPositions1 != null && pointsByPositions2 != null) {
                    for (Map.Entry<String, Integer> currentPointsByPosition1 : pointsByPositions1.entrySet()) {
                        String currentPosition1 = currentPointsByPosition1.getKey();
                        for (Map.Entry<String, Integer> currentPointsByPosition2 : pointsByPositions2.entrySet()) {
                            String currentPosition2 = currentPointsByPosition2.getKey();
                            if (currentPosition1.equals(currentPosition2)) {
                                int sum1 = getSum(pointsByPositions1);
                                int sum2 = getSum(pointsByPositions2);

                                if (sum1 > sum2) {
                                    pointsByPositionsMapsByParticipants.remove(currentPretender);
                                    isRemoved = true;
                                } else if (sum2 > sum1) {
                                    pointsByPositionsMapsByParticipants.remove(currentParticipant);
                                    isRemoved = true;
                                }
                            }
                            if (isRemoved) {
                                break;
                            }
                        }
                        if (isRemoved) {
                            break;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        // 3. Sorting and printing
        pointsByPositionsMapsByParticipants.entrySet().stream()
                .sorted((e1, e2) -> {
                    int result = getSort1Result(e1, e2);
                    return result;
                }).forEach((entry) -> {
                    String currentPart = entry.getKey();
                    int currentPointsSum = getSum(entry.getValue());
                    System.out.printf("%s: %d skill\n", currentPart, currentPointsSum);

                    Map<String, Integer> currentPointsByPosition = entry.getValue();
                    currentPointsByPosition.entrySet().stream()
                            .sorted((e1, e2) -> {
                                int result = getSort2Result(e1.getValue(), e2.getValue(), e1.getKey(), e2.getKey());
                                return result;
                            }).forEach((innerEntry) -> {
                                String currentPosition = innerEntry.getKey();
                                int currentPoints = innerEntry.getValue();
                                System.out.printf("- %s <::> %d\n", currentPosition, currentPoints);
                            });
                });
    }

    private static int getSort2Result(Integer e1, Integer e2, String e11, String e21) {
        int score1 = e1;
        int score2 = e2;
        int result = Integer.compare(score2, score1);
        if (result == 0) {
            String position1 = e11;
            String position2 = e21;
            result = position1.compareTo(position2);
        }
        return result;
    }

    private static int getSort1Result(Map.Entry<String, Map<String, Integer>> e1, Map.Entry<String, Map<String, Integer>> e2) {
        Map<String, Integer> map1 = e1.getValue();
        Map<String, Integer> map2 = e2.getValue();
        int result = getSort2Result(getSum(map1), getSum(map2), e1.getKey(), e2.getKey());
        return result;
    }

    private static int getSum(Map<String, Integer> pointsByPositions) {
        return pointsByPositions.values().stream().mapToInt(e -> e).sum();
    }
}
