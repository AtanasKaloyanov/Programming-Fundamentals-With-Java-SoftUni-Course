package T06ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students { static class Students {

    String firstName;
    String lastName;
    String age;
    String hometown;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Students> studentsList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentInformation = input.split(" ");

            String firstName = studentInformation[0];
            String lastName = studentInformation[1];
            String age = studentInformation[2];
            String hometown = studentInformation[3];

            Students students = new Students();

            students.setFirstName(firstName);
            students.setLastName(lastName);
            students.setAge(age);
            students.setHometown(hometown);

            studentsList.add(students);

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();

        for (Students info : studentsList) {
            if (info.getHometown().equals(command)) {
                System.out.printf("%s %s is %s years old%n", info.getFirstName(), info.getLastName(), info.getAge());
            }
        }
    }
}
