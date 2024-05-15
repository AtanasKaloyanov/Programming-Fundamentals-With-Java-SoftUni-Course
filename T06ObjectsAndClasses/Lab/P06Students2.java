package T06ObjectsAndClasses.Lab;

import java.util.*;

public class P06Students2 {
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

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        @Override
        public String toString() {
            return String.format("%s %s is %d years old", this.firstName, this.lastName, this.age);
        }
    }

    //               homeTown firstName+lastName Student
    private static Map<String, Map<String, Student>> studenstByTown = new LinkedHashMap<>();

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. While cycle algorithm
        while (!input.equals("end")) {
            // 2.1. Arrays reading
            String[] currentArray = input.split(" ");
            String currentFirstName = currentArray[0];
            String currentLastName = currentArray[1];
            int currentAge = Integer.parseInt(currentArray[2]);
            String currentHomeTown = currentArray[3];

            // 2.2. Finding if the student exis via 2 variables - a boolean and a Student object.
            String currentNames = currentFirstName + currentLastName;
            Student searchedStudent = null;
            boolean studentExist = false;

            for (Map.Entry<String, Map<String, Student>> entry : studenstByTown.entrySet()) {
                Map<String, Student> innerMap = entry.getValue();
                Student removedStudent = innerMap.remove(currentNames);
                if (removedStudent != null) {
                    searchedStudent = removedStudent;
                    studentExist = true;
                    break;
                }
            }

            // 2.3. Student assignment
            if (studentExist) {
                searchedStudent.setAge(currentAge);
                searchedStudent.setHomeTown(currentHomeTown);
            } else {
                searchedStudent = new Student(currentFirstName, currentLastName, currentAge, currentHomeTown);
            }

            // 2.4. Student adding
            studenstByTown.putIfAbsent(currentHomeTown, new LinkedHashMap<>());
            Map<String, Student> studentsByNames = studenstByTown.get(currentHomeTown);
            studentsByNames.put(currentNames, searchedStudent);

            input = scanner.nextLine();
        }

        // 3. Output printing
        String searchedTown = scanner.nextLine();
        Map<String, Student> searchedStudents = studenstByTown.get(searchedTown);
        searchedStudents.values().forEach(System.out::println);
    }
}
