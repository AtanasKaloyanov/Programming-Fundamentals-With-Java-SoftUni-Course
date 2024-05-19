package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        // 1. Input reading:
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Adding grades in lists by names via a map
        Map<String, List<Double>> gradesListsByStudents = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String currentName = scanner.nextLine();
            double currentGrade = Double.parseDouble(scanner.nextLine());
            gradesListsByStudents.putIfAbsent(currentName, new ArrayList<>());
            gradesListsByStudents.get(currentName).add(currentGrade);
        }

        // 3. Output printing:
        gradesListsByStudents.forEach((student, gradesList) -> {
            double gradesAvg = getAvgGrade(gradesList);
            if (gradesAvg >= 4.50) {
                System.out.printf("%s -> %.2f\n", student, gradesAvg);
            }
        });
    }

    private static double getAvgGrade(List<Double> gradesList) {
        return gradesList.stream()
                .mapToDouble((e) -> e)
                .average().getAsDouble();
    }
}




