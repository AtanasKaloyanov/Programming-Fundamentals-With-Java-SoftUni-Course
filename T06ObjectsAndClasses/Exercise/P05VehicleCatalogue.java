package T06ObjectsAndClasses.Exercise;


import java.util.*;

public class P05VehicleCatalogue {
    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            String printType = Character.toUpperCase(this.type.charAt(0)) + this.type.substring(1);
            result.append("Type: ").append(printType).append("\n");
            result.append("Model: ").append(this.model).append("\n");
            result.append("Color: ").append(this.color).append("\n");
            result.append("Horsepower: ").append(this.horsePower);

            return result.toString();
        }
    }

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Adding vehicles by their model and horsepower sum by the type of the vehicles
        //   model
        Map<String, Set<Vehicle>> vehiclesByModel = new LinkedHashMap<>();
        List<Integer> truckHorsePower = new ArrayList<>();
        List<Integer> carsHorsePower = new ArrayList<>();

        while (!input.equals("End")) {
            String[] currentArray = input.split(" ");
            String currentType = currentArray[0];
            String currentModel = currentArray[1];
            String currentColor = currentArray[2];
            int currentHorsePower = Integer.parseInt(currentArray[3]);

            Vehicle currentVehicle = new Vehicle(currentType, currentModel, currentColor, currentHorsePower);
            vehiclesByModel.putIfAbsent(currentModel, new LinkedHashSet<>());
            vehiclesByModel.get(currentModel).add(currentVehicle);

            switch (currentType) {
                case "truck":
                    truckHorsePower.add(currentHorsePower);
                    break;

                case "car":
                    carsHorsePower.add(currentHorsePower);
                    break;
            }
            input = scanner.nextLine();
        }

        // 3. Keys reading and searched vehicles printing
        String currentKey = scanner.nextLine();
        while (!currentKey.equals("Close the Catalogue")) {
            Set<Vehicle> currentSearchedVehicles = vehiclesByModel.get(currentKey);
            for (Vehicle currentSearchedVehicle : currentSearchedVehicles) {
                System.out.println(currentSearchedVehicle);
            }
            currentKey = scanner.nextLine();
        }

        // 4. Average horsepower by type calculation and printing
        int carsSum = getSum(carsHorsePower);
        int truckSum = getSum(truckHorsePower);
        double avgCarsHorsePower = getAvgCarsHorsePower(carsHorsePower, carsSum);
        double avgTruckHorsePower = getAvgCarsHorsePower(truckHorsePower, truckSum);
        System.out.printf("Cars have average horsepower of: %.2f.\n", avgCarsHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.", avgTruckHorsePower);
    }

    private static double getAvgCarsHorsePower(List<Integer> carsHorsePower, int carsSum) {
        if (carsHorsePower.isEmpty()) {
            return 0;
        }
        return carsSum * 1.0 / carsHorsePower.size();
    }

    private static int getSum(List<Integer> horsePowerSum) {
        return horsePowerSum.stream().mapToInt((element) -> element).sum();
    }
}
