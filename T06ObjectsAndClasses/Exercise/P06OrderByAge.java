package T06ObjectsAndClasses.Exercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P06OrderByAge {
    static class Person implements Comparable<Person>{
        private String name;
        private String ID;
        private int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        @Override
        public int compareTo(Person person) {
            return Integer.compare(this.age, person.age);
        }

        @Override
        public String toString() {
            return this.name + " with ID: " +
                    this.ID + " is " +
                    this.age + " years old.";
        }
    }

    public static void main(String[] args) {

        // 1. Reading input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Adding the people in a tree set
        Set<Person> people = new TreeSet<>();
        while (!input.equals("End")) {
            String[] currentArray = input.split(" ");
            String currentName = currentArray[0];
            String currentID = currentArray[1];
            int currentAge = Integer.parseInt(currentArray[2]);

            Person currentPerson = new Person(currentName, currentID, currentAge);
            people.add(currentPerson);
            input = scanner.nextLine();
        }

        // 3. People printing
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

