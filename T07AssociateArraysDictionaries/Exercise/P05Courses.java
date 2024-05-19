package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Filling a map with courses as keys and List<String> as values:
        Map<String, Set<String>> studentsSetsByCourses = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String[] array = input.split(" : ");
            String currentCourse = array[0];
            String currentStudent = array[1];

            studentsSetsByCourses.putIfAbsent(currentCourse, new LinkedHashSet<>());
            studentsSetsByCourses.get(currentCourse).add(currentStudent);
            input = scanner.nextLine();
        }

        // 3. Output printing:
        studentsSetsByCourses.forEach( (course, studentsSet) -> {
            int studentsNumber = studentsSet.size();
            System.out.printf("%s: %d\n", course, studentsNumber);
            for (String currentStudent : studentsSet) {
                System.out.printf("-- %s\n", currentStudent);
            }
        });
    }
}





