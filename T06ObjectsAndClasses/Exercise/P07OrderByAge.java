package T06ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class P07OrderByAge {
    public static class Person {

        String name;
        int ID;
        int age;

        public Person(String name, int ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %d is %d years old.", this.name, this.ID, this.age);
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<Person> allPersonsList = new ArrayList<>();

            String input = scanner.nextLine();
            while (!input.equals("End")) {

                String[] data = input.split(" ");

                String name = data[0];
                int ID = Integer.parseInt(data[1]);
                int age = Integer.parseInt(data[2]);

                Person peron = new Person(name, ID, age);

                allPersonsList.add(peron);

                input = scanner.nextLine();
            }

            allPersonsList.stream()
                    .sorted((firstPersonAge, secondPersonAge) -> Integer.compare(firstPersonAge.getAge(), secondPersonAge.getAge()))
                    .forEach(p -> System.out.println(p.toString()));

        }
}

