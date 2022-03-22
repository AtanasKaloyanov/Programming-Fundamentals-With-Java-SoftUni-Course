package T06ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static class Students {
        String name;
        Double avarageGrade;

        public Students(String name, Double avarageGrade) {
            this.name = name;
            this.avarageGrade = avarageGrade;
        }

        public Students() {

        }

        public String getData() {
            return String.format("I am %s with %.2f avarage grade.", this.name , this.avarageGrade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Students st1 = new Students("Atanas", 6.00);
        Students st2 = new Students("Denica", 5.90);
        Students st3 = new Students("Mona", 5.80);
        Students st4 = new Students("Gergana", 5.70);

        List<Students> studentsList = new ArrayList<>(Arrays.asList(st1, st2, st3, st4));

        studentsList
                .stream().sorted((s1, s2) -> Double.compare(s2.avarageGrade, s1.avarageGrade))
                .forEach(s -> System.out.println(s.getData()));
    }
}
