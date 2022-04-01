package FinalExamPreparation.E05FinalExam04April2020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Pirates {
    public static class Town {
        String name;
        int pupulation;
        int gold;

        public Town(String name, int pupulation, int gold) {
            this.name = name;
            this.pupulation = pupulation;
            this.gold = gold;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPupulation(int pupulation) {
            this.pupulation = pupulation;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public int getPupulation() {
            return pupulation;
        }

        public int getGold() {
            return gold;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Town> map = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Sail")) {

            String[] array = input.split("\\|\\|");
            String town = array[0];
            int population = Integer.parseInt(array[1]);
            int gold = Integer.parseInt(array[2]);


            if (map.containsKey(town)) {
                int currentPopulation = map.get(town).getPupulation();
                int currentGold = map.get(town).getGold();

                map.get(town).setPupulation(currentPopulation + population);
                map.get(town).setGold(currentGold + gold);
            } else {
                map.put(town, new Town(town, population, gold));
            }

            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();

        while (!secondInput.equals("End")) {

            String[] data = secondInput.split("=>");
            String command = data[0];

            switch (command) {
                case "Plunder":

                    String town = data[1];
                    int population = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);

                    int currentPopulation = map.get(town).getPupulation();
                    int currentGold = map.get(town).getGold();

                    map.get(town).setPupulation(currentPopulation - population);
                    map.get(town).setGold(currentGold - gold);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, population);

                    if (map.get(town).getPupulation() == 0 || map.get(town).getGold() == 0){
                        map.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }

                    break;

                case "Prosper":

                    String town2 = data[1];
                    int gold2 = Integer.parseInt(data[2]);

                    if (gold2 < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int currentGold2 = map.get(town2).getGold();
                                map.get(town2).setGold(currentGold2 + gold2);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold2, town2, map.get(town2).getGold());
                    }

                    break;
            }

            secondInput = scanner.nextLine();
        }

        if (map.size() != 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", map.entrySet().size());
            map.entrySet().forEach(entry -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(),
                    entry.getValue().getPupulation(), entry.getValue().getGold()));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
