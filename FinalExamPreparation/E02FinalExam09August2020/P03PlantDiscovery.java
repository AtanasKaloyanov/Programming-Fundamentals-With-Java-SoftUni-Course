package FinalExamPreparation.E02FinalExam09August2020;

import java.util.*;

public class P03PlantDiscovery {
    public static class Plant {
        String name;
        String rarity;
        double rating;

        public void setRarity(String rarity) {
            this.rarity = rarity;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public String getRarity() {
            return rarity;
        }

        public double getRating() {
            return rating;
        }

        public Plant(String name, String rarity, double rating) {
            this.name = name;
            this.rarity = rarity;
            this.rating = rating;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Plant> plantMap = new LinkedHashMap<>();
        Map<String, List<Double>> avarageMap = new LinkedHashMap<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            String[] array = scanner.nextLine().split("<->");
            String plantName = array[0];
            String rarity = array[1];

            if (plantMap.containsKey(plantName)) {
                plantMap.get(plantName).setRarity(rarity);
            } else {
                plantMap.put(plantName, new Plant(plantName, rarity, 0.0));
            }

            avarageMap.putIfAbsent(plantName, new ArrayList<>());
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {

            String[] array = input.split(" - | ");
            String command = array[0];

            switch (command) {

                case "Rate:":
                    String plant = array[1];
                    double rating = Double.parseDouble(array[2]);

                    if (plantMap.containsKey(plant)) {

                        avarageMap.get(plant).add(rating);
                        double avarage = avarageMap.get(plant).stream().mapToDouble(e -> e.doubleValue()).average().getAsDouble();
                        plantMap.get(plant).setRating(avarage);

                    } else {
                        System.out.println("error");
                    }

                    break;

                case "Update:":
                    String plant2 = array[1];
                    String newRarity = array[2];

                       if (plantMap.containsKey(plant2)) {
                           plantMap.get(plant2).setRarity(newRarity);
                       } else {
                           System.out.println("error");
                       }

                    break;

                case "Reset:":
                    String plant3 = array[1];

                    if (plantMap.containsKey(plant3)) {
                        plantMap.get(plant3).setRating(0);
                        avarageMap.get(plant3).removeAll(avarageMap.get(plant3));
                    } else {
                        System.out.println("error");
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
       plantMap.entrySet().forEach(entry -> System.out.printf("- %s; Rarity: %s; Rating: %.2f%n", entry.getKey(), entry.getValue().getRarity(), entry.getValue().getRating()));

    }
}

