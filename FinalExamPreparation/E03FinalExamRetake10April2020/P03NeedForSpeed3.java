package FinalExamPreparation.E03FinalExamRetake10April2020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03NeedForSpeed3 {
    public static class Car {
        String car;
        int mileage;
        int fuel;

        public String getCar() {
            return car;
        }

        public void setCar(String car) {
            this.car = car;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        public int getMileage() {
            return mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public Car(String car, int mileage, int fuel) {
            this.car = car;
            this.mileage = mileage;
            this.fuel = fuel;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, Car> map = new LinkedHashMap<>();

        for (int i = 1; i <= number; i++) {

            String[] array = scanner.nextLine().split("\\|");
            String car = array[0];
            int mileage = Integer.parseInt(array[1]);
            int fuel = Integer.parseInt(array[2]);

            map.put(car, new Car(car, mileage, fuel));
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] array = input.split(" : ");
            String command = array[0];

            switch (command) {

                case "Drive":
                    String ccar = array[1];
                    int distace = Integer.parseInt(array[2]);
                    int fuel = Integer.parseInt(array[3]);

                    if (map.get(ccar).getFuel() < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int currentMileage = map.get(ccar).getMileage();
                        map.get(ccar).setMileage(currentMileage + distace);
                        int currentFuel = map.get(ccar).getFuel();
                        map.get(ccar).setFuel(currentFuel - fuel);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", ccar, distace, fuel);

                        if (map.get(ccar).getMileage() >= 100000) {
                            map.remove(ccar);
                            System.out.printf("Time to sell the %s!%n", ccar);
                        }
                    }

                    break;

                case "Refuel":
                    String car = array[1];
                    int fuel2 = Integer.parseInt(array[2]);

                    int currentFuel = map.get(car).getFuel();

                    map.get(car).setFuel(currentFuel + fuel2);

                    if (map.get(car).getFuel() > 75) {
                        map.get(car).setFuel(75);
                        int refueled = 75 - currentFuel;

                        System.out.printf("%s refueled with %d liters%n", car, refueled);
                    } else {
                        System.out.printf("%s refueled with %d liters%n", car, fuel2);
                    }

                    break;

                case "Revert":
                    String car2 = array[1];
                    int kilo = Integer.parseInt(array[2]);

                    int currentMileage = map.get(car2).getMileage();
                    map.get(car2).setMileage(currentMileage - kilo);

                    if (map.get(car2).getMileage() < 10000) {
                        map.get(car2).setMileage(10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", car2, kilo);
                    }

                    break;

            }

            input = scanner.nextLine();
        }

        map.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().getMileage(), entry.getValue().getFuel()));
    }
}
