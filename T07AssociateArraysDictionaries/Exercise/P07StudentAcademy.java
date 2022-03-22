package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairsNumber = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentAndGrade = new LinkedHashMap<>();

        for (int i = 0; i < pairsNumber * 2; i += 2) {

            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentAndGrade.containsKey(student)) {
                studentAndGrade.put(student, new ArrayList<>());
                studentAndGrade.get(student).add(grade);
            } else {
                studentAndGrade.get(student).add(grade);
            }

        }

        Map<String, Double> printMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentAndGrade.entrySet()) {

            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                Double currentGrade = entry.getValue().get(i);
                sum += currentGrade;
            }

            double avarageGrade = sum / entry.getValue().size();

            if (avarageGrade >= 4.50) {
                printMap.put(entry.getKey(), avarageGrade);
            }

        }

        for (Map.Entry<String, Double> entry : printMap.entrySet()) {

            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());

        }
    }
}


//5
//John
//5.5
//John
//4.5
//Alice
//6
//Alice
//3
//George
//5

//John -> 5.5, 4.5
//Alice -> 6, 3
//George -> 5

//John -> 5.00
//Alice -> 4.50
//George -> 5.00


