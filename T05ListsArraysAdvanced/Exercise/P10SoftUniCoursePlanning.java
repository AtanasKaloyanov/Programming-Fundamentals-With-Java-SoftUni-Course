package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        List<String> list = readList(scanner);

        // 2. Commands implementations
        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] currentArray = input.split(":");
            String currentCommand = currentArray[0];
            String currentTitle = currentArray[1];
            String currentExercise = currentTitle + "-Exercise";
            switch (currentCommand) {
                case "Add":
                    if (!list.contains(currentTitle)) {
                        list.add(currentTitle);
                    }
                    break;
                case "Insert":
                    if (!list.contains(currentTitle)) {
                        int currentIndex = Integer.parseInt(currentArray[2]);
                        if (currentIndex < 0 || currentIndex >= list.size()) {
                            input = scanner.nextLine();
                            continue;
                        }
                        list.add(currentIndex, currentTitle);
                    }
                    break;
                case "Remove":
                    int removedIndex = list.indexOf(currentTitle);
                    if (removedIndex != -1) {
                        list.remove(currentTitle);
                        if (removedIndex != list.size() && !list.isEmpty()) {
                            String elementAfterRemovedElement = list.get(removedIndex);
                            if (elementAfterRemovedElement.equals(currentExercise)) {
                                list.remove(currentExercise);
                            }
                        }
                    }

                    break;
                case "Swap":
                    String currentTitle2 = currentArray[2];
                    int firstLessonIndex = list.indexOf(currentTitle);
                    int secondLessonIndex = list.indexOf(currentTitle2);

                    if (firstLessonIndex != -1 && secondLessonIndex != -1) {
                        list.set(firstLessonIndex, currentTitle2);
                        list.set(secondLessonIndex, currentTitle);
                        int exerciseIndex1 = list.indexOf(currentExercise);
                        if (exerciseIndex1 != -1) {
                            list.remove(currentExercise);
                            list.add(secondLessonIndex + 1 , currentExercise);
                        }

                        String exercise2 = currentTitle2 + "-Exercise";
                        int exerciseIndex2 = list.indexOf(exercise2);
                        if (exerciseIndex2 != -1) {
                            list.remove(exercise2);
                            list.add(firstLessonIndex + 1, exercise2);
                        }

                    }
                    break;
                case "Exercise":
                    int index = list.indexOf(currentTitle);

                    if (index == list.size() - 1) {
                        list.add(currentExercise);
                    } else if (index != -1) {
                        String elementAfterLab = list.get(index + 1);
                        if (!elementAfterLab.equals(currentExercise)) {
                            list.add(index + 1, currentExercise);
                        }
                    } else {
                        list.add(currentTitle);
                        list.add(currentExercise);
                    }
                    break;
                    /*
                    Arrays, Lists, Methods
                    Exercise:Methods
                    course start
                     */
            }
            input = scanner.nextLine();
        }

        // 2. Output printing
        for (int i = 0; i < list.size(); i++) {
            int currentNumber = i + 1;
            String currentObject = list.get(i);
            System.out.printf("%d.%s\n", currentNumber, currentObject);
        }
    }

    public static List<String> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
    }
}
