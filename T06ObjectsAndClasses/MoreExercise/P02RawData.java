package T06ObjectsAndClasses.MoreExercise;

import java.util.*;

public class P02RawData {
    static class Car {
        private String model;
        private Engine engine;
        private Cargo cargo;
        private List<Tire> tires;

        public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tires = tires;
        }

        public List<Tire> getTires() {
            return this.tires;
        }

        public Engine getEngine() {
            return this.engine;
        }

        public boolean hasBadTire() {
            for (Tire tire : this.getTires()) {
                if ( (tire.pressure) < 1) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return this.model;
        }

    }

    static class Engine {
        private int engineSpeed;
        private int enginePower;

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

        public int getPower() {
            return this.enginePower;
        }
    }

    static class Cargo {
        private int cargoWeight;
        private String cargoType;

        public Cargo(int cargoWeight, String cargoType) {
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
        }
    }

    static class Tire {
        private double pressure;
        private int age;

        public Tire(double pressure, int age) {
            this.pressure = pressure;
            this.age = age;
        }

        public double getPressure() {
            return this.pressure;
        }
    }
    private static Map<String, Set<Car>> carsByCargoType = new HashMap<>();

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. model, engine, cargo and tires objects initialisation
        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split(" ");
            // String model
            String currentModel = currentArray[0];

            // Engine engine
            int currentEngineSpeed = Integer.parseInt(currentArray[1]);
            int currentEnginePower = Integer.parseInt(currentArray[2]);
            Engine currentEngine = new Engine(currentEngineSpeed, currentEnginePower);

            // Cargo cargo
            int currentCargoWeight = Integer.parseInt(currentArray[3]);
            String currentCargoType = currentArray[4];
            Cargo currentCargo = new Cargo(currentCargoWeight, currentCargoType);

            // List<Tire> tires
            List<Tire> currentTiresList = new ArrayList<>();
            for (int j = 5; j <= 12; j++) {
                double currentPressure = Double.parseDouble(currentArray[j]);
                j++;
                int currentAge = Integer.parseInt(currentArray[j]);
                Tire currentTire = new Tire(currentPressure, currentAge);
                currentTiresList.add(currentTire);
            }

            Car currentCar = new Car(currentModel, currentEngine, currentCargo, currentTiresList);
            carsByCargoType.putIfAbsent(currentCargoType, new LinkedHashSet<>());
            carsByCargoType.get(currentCargoType).add(currentCar);
        }

        // 2. Output - 2 cases:
        String searchedType = scanner.nextLine();
        Set<Car> searchedCars = carsByCargoType.get(searchedType);

        if (searchedType.equals("fragile")) {
            searchedCars.stream()
                    .filter(Car::hasBadTire)
                    .forEach( (System.out::println));
        } else if (searchedType.equals("flamable"))  {
            searchedCars.stream()
                    .filter((car) -> car.getEngine().getPower() > 250)
                    .forEach( (System.out::println));
        }
    }

}
