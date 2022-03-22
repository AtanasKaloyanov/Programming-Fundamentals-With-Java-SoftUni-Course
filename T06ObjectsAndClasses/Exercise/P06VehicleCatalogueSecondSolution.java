package T06ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06VehicleCatalogueSecondSolution {
    public static class Vehicle {
        String type;
        String model;
        String color;
        int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public int getHorsePower() {
            return horsePower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %s", getType().toUpperCase().charAt(0) + getType().substring(1), this.model, this.color, this.horsePower);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        while (!input.equals("End")) {

            String[] data = input.split(" ");

            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);

            if (type.equals("car")) {
                cars.add(vehicle);
            } else if (type.equals("truck")) {
                trucks.add(vehicle);
            }

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();

        while (!secondInput.equals("Close the Catalogue")) {

            String model = secondInput;

            cars.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            trucks.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            secondInput = scanner.nextLine();
        }

        double avarageCarsHorsePower = avarageHorsePower(cars);
        double avavarageTrucksHorsePower = avarageHorsePower(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", avarageCarsHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.", avavarageTrucksHorsePower);

    }

    public static double avarageHorsePower(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        } else {
            return vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicles.size();
        }
    }
}
