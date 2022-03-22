package T06ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03OpinionPoll {
    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.name, this.age);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Person> allPeopleList = new ArrayList<>();

        for (int i = 1; i <= number; i++) {

            String[] currentArray = scanner.nextLine().split(" ");

            String name = currentArray[0];
            int age = Integer.parseInt(currentArray[1]);

            Person person = new Person(name, age);

            allPeopleList.add(person);
        }

        allPeopleList.stream()
                .filter(person -> person.getAge() > 30)
                .forEach(p -> System.out.println(p.toString()));
    }
}
