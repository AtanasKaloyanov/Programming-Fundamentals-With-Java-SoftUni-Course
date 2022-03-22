package T06ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {
    public static class Students {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        public Students(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }


        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Students> allStudentsList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentsInfo = input.split("\\s+");

            String firstName = studentsInfo[0];
            String lastName = studentsInfo[1];
            int age = Integer.parseInt(studentsInfo[2]);
            String homeTown = studentsInfo[3];

            if (!isCurrentStudentExist(allStudentsList, firstName, lastName, age, homeTown)) {

                Students students = new Students(firstName, lastName, age, homeTown);

                allStudentsList.add(students);

            }
            input = scanner.nextLine();
        }

        String command = scanner.nextLine();

        for (Students info : allStudentsList) {
            if (info.getHomeTown().equals(command)) {
                System.out.printf("%s %s is %d years old%n", info.getFirstName(), info.getLastName(), info.getAge());
            }
        }
    }

    public static boolean isCurrentStudentExist(List<Students> allStudentsList, String firstName, String lastName, int age, String homeTown) {
        for (Students info : allStudentsList) {
            boolean isFirstNameEqual = info.getFirstName().equals(firstName);
            boolean isSecondNameEqual = info.getLastName().equals(lastName);

            if (isFirstNameEqual && isSecondNameEqual) {
                info.setAge(age);
                info.setHomeTown(homeTown);
                return true;
            }
        }
        return false;
    }
}
