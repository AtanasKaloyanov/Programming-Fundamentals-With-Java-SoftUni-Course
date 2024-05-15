package T06ObjectsAndClasses.Lab;

import java.util.*;

public class P05Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %d years old", this.firstName, this.lastName, this.age);
        }
    }

    //                homeTown
    private static Map<String, List<Student>> studenstByTown = new LinkedHashMap<>();

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. While cycle algorithm
        while (!input.equals("end")) {
            String[] currentArray = input.split(" ");
            String currentFirstName = currentArray[0];
            String currentLastName = currentArray[1];
            int currentAge = Integer.parseInt(currentArray[2]);
            String currentHomeTown = currentArray[3];

            Student student = new Student(currentFirstName, currentLastName, currentAge, currentHomeTown);
            studenstByTown.putIfAbsent(currentHomeTown, new ArrayList<>());
            studenstByTown.get(currentHomeTown).add(student);

            input = scanner.nextLine();
        }

        // 3. Final key reading and output printing
        String searchedTown = scanner.nextLine();
        List<Student> searchedStudents = studenstByTown.get(searchedTown);
        for (Student student : searchedStudents) {
            System.out.println(student);
        }
    }
}
