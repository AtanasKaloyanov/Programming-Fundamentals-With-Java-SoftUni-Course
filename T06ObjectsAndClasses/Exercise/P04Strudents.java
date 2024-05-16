package T06ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class P04Strudents {
    public static class Student {
        String firstName;
        String lastName;
        double grade;

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = Integer.parseInt(scanner.nextLine());
        ArrayList <Student> allStudentsList = new ArrayList<>();

        for (int i = 1; i <= numberStudents ; i++) {

            String [] studentInformation = scanner.nextLine().split(" ");

            String firstName = studentInformation[0];
            String lastName = studentInformation[1];
            double grade = Double.parseDouble(studentInformation[2]);

            Student student = new Student(firstName, lastName, grade);

            allStudentsList.add(student);
        }

        allStudentsList
                .stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(s -> System.out.println(s.toString()));

    }
}
