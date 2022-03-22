package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        // Първоначален лист - Arrays, Lists, Methods     Arrays, Lists, Methods
        // Команден лист -     Swap:Arrays:Methods        Methods, Lists, Arrays
        // Команден лист -     Exercise:Databases         Methods, Lists, Arrays, Databases, Databases-Exercise
        // Команден лист -     Swap:Lists:Databases       Methods, Databases, Databases-Exercise, Arrays, Lists
        // Команден лист -     Insert:Arrays:0            Methods, Databases, Databases-Exercise, Arrays, Lists
        // Край на цикъла -    course start
        String input = scanner.nextLine();

        while (!input.equals("course start")) {

            List<String> currentList = Arrays.stream(input.split(":")).collect(Collectors.toList());

            String command = currentList.get(0); //Възможни команди : Add, Insert, Remove, Swap, Exercise
            String leessonTitle = currentList.get(1); //Заглавието на урока

            switch (command) {

                case "Add":

                    boolean doesExist = schedule.contains(leessonTitle);

                    if (!doesExist) {
                        schedule.add(schedule.size(), leessonTitle);
                    }

                    break;

                case "Insert":

                    int index = Integer.parseInt(currentList.get(2));
                    boolean doesExist2 = schedule.contains(leessonTitle);

                    if (!doesExist2) {
                        schedule.add(index, leessonTitle);
                    }

                    break;

                case "Remove":

                    boolean doesExist3 = schedule.contains(leessonTitle);

                    if (doesExist3) {
                        schedule.remove(leessonTitle);
                    }

                    break;

                case "Swap":

                    String secondLesson = currentList.get(2);
                    boolean doesExist4 = schedule.contains(leessonTitle);
                    boolean doesExist5 = schedule.contains(secondLesson);

                    if (doesExist4 && doesExist5) {

                        int firstIndex = schedule.indexOf(leessonTitle);
                        int secondIndex = schedule.indexOf(secondLesson);

                        schedule.set(firstIndex, secondLesson);
                        schedule.set(secondIndex, leessonTitle);

                        String firstExercise = leessonTitle + "-Exercise";
                        String secondExercise = secondLesson + "-Exercise";

                        if (schedule.contains(firstExercise)) {
                            schedule.remove(firstExercise);
                            schedule.add(secondIndex + 1, firstExercise);
                        }

                        if (schedule.contains(secondExercise)) {
                            schedule.remove(secondExercise);
                            schedule.add(firstIndex + 1, secondExercise);
                        }
                    }

                    break;

                case "Exercise":

                    boolean doesExist6 = schedule.contains(leessonTitle);

                    String exercise = leessonTitle + "-Exercise";
                    boolean doesExist7 = schedule.contains(exercise);

                    int lessonIndex = schedule.indexOf(leessonTitle);

                    if (doesExist6 && !doesExist7) {
                        schedule.add(lessonIndex + 1, exercise);
                    }

                    if (!doesExist6) {
                        schedule.add(schedule.size(), leessonTitle);
                        schedule.add(schedule.size(), exercise);
                    }

                    break;
            }

            input = scanner.nextLine();
        }
        int i = 0;
        for (String currentElement : schedule) {

            System.out.printf("%d.%s%n", i+1, currentElement);
             i++;
        }
    }
}
