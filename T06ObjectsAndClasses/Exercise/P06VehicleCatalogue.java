package T06ObjectsAndClasses.Exercise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06VehicleCatalogue {
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
                    "Horsepower: %d", getType().toUpperCase().charAt(0) + getType().substring(1), this.model, this.color, this.horsePower);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<Vehicle> allVehiclesList = new ArrayList<>();

        while (!input.equals("End")) {

            String[] data = input.split(" ");

            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);

            allVehiclesList.add(vehicle);

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();

        while (!secondInput.equals("Close the Catalogue")) {

            String model = secondInput;

            allVehiclesList.stream()
                    .filter(vehicle -> vehicle.getModel().equals(model))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            secondInput = scanner.nextLine();
        }

        List<Vehicle> cars = allVehiclesList.stream()
                .filter(vehicle -> vehicle.getType().equals("car"))
                .collect(Collectors.toList());

        List<Vehicle> trucks = allVehiclesList.stream()
                .filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());

        double averageCarsHorsePower = averageHorsePower(cars);
        double averageTrucksHorsePower = averageHorsePower(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucksHorsePower);
    }

    static double averageHorsePower(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        }
        return vehicles.stream().mapToDouble(Vehicle -> Vehicle.getHorsePower()).sum() / vehicles.size();
        //return vehicles.stream().mapToDouble(Vehicle::getHorsePower).sum() / vehicles.size();
    }
}
