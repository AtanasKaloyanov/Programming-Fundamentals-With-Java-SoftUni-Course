package T06ObjectsAndClasses.MoreExercise;

import java.util.*;

public class P03CarSalesman {

    static class Engine {
        private String model;
        private int power;
        private String displacement;
        private String efficiency;

        public Engine(String model, int power, String displacement, String efficiency) {
            this.model = model;
            this.power = power;
            this.displacement = displacement;
            this.efficiency = efficiency;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("  ").append(this.model).append(":").append("\n");
            result.append("    ").append("Power: ").append(this.power).append("\n");
            result.append("    ").append("Displacement: ").append(this.displacement).append("\n");
            result.append("    ").append("Efficiency: ").append(this.efficiency).append("\n");

            return result.toString();
        }
    }

    static class Car {
        private String model;
        private Engine engine;
        private String weight;
        private String color;

        public Car(String model, Engine engine, String weight, String color) {
            this.model = model;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }


        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append(this.model).append(":").append("\n");
            result.append(this.engine);
            result.append("  ").append("Weight: ").append(this.weight).append("\n");
            result.append("  ").append("Color: ").append(this.color);

            return result.toString();
        }
    }

    private static Map<String, Engine> enginesByModel = new HashMap<>();
    private static Set<Car> cars = new LinkedHashSet<>();

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Engines reading
        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split(" ");
            String currentModel = currentArray[0];
            int currentPower = Integer.parseInt(currentArray[1]);
            String currentDisplacement = "n/a";
            String currentEfficiency = "n/a";

            if (currentArray.length == 3) {
                String info = currentArray[2];
                if (toNumberConverter(info)) {
                    currentDisplacement = info;
                } else {
                    currentEfficiency = info;
                }
            } else if (currentArray.length == 4) {
                currentDisplacement = currentArray[2];
                currentEfficiency = currentArray[3];
            }

            Engine currenEngine = new Engine(currentModel, currentPower, currentDisplacement, currentEfficiency);
            enginesByModel.put(currentModel, currenEngine);
        }

        // 3. Cars reading
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] currentArray = scanner.nextLine().split(" ");
            String currentModel = currentArray[0];
            String currentEngineModel = currentArray[1];
            Engine currentEngine = enginesByModel.get(currentEngineModel);
            String currentWeight = "n/a";
            String currentColor = "n/a";

            if (currentArray.length == 3) {
                String info = currentArray[2];
                if (toNumberConverter(info)) {
                    currentWeight = info;
                } else {
                    currentColor = info;
                }
            } else if (currentArray.length == 4) {
                currentWeight = currentArray[2];
                currentColor = currentArray[3];
            }

            Car currentCar = new Car(currentModel, currentEngine, currentWeight, currentColor);
            cars.add(currentCar);
        }

        // 4. Output printing
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static boolean toNumberConverter(String info) {
        try {
            int number = Integer.parseInt(info);
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }
}
