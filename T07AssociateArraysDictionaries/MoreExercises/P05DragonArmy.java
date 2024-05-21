package T07AssociateArraysDictionaries.MoreExercises;

import java.util.*;

public class P05DragonArmy {
    static class Dragon implements Comparable<Dragon> {
        private String type;
        private String name;
        private int damage;
        private int health;
        private int armor;

        public Dragon(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getArmor() {
            return armor;
        }

        public void setArmor(int armor) {
            this.armor = armor;
        }

        @Override
        public int compareTo(Dragon dragon2) {
            return this.getName().compareTo(dragon2.getName());
        }

        @Override
        public String toString() {
            return String.format("-%s -> damage: %d, health: %d, armor: %d", this.name, this.damage, this.health, this.armor);
        }

    }

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //   type
        Map<String, Set<Dragon>> dragonsSetByTypes = new LinkedHashMap<>();

        // 2. For cycle
        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split(" ");
            String currentType = currentArray[0];
            String currentName = currentArray[1];
            int currentDamage = 45;
            if (!currentArray[2].equals("null")) {
                currentDamage = Integer.parseInt(currentArray[2]);
            }

            int currentHealth = 250;
            if (!currentArray[3].equals("null")) {
                currentHealth = Integer.parseInt(currentArray[3]);
            }

            int currentArmor = 10;
            if (!currentArray[4].equals("null")) {
                currentArmor = Integer.parseInt(currentArray[4]);
            }

            dragonsSetByTypes.putIfAbsent(currentType, new TreeSet<>());
            Set<Dragon> currentDragons = dragonsSetByTypes.get(currentType);
            Dragon dragon = new Dragon(currentType, currentName);

            for (Dragon currentDragon : currentDragons) {
                if (currentDragon.getName().equals(currentName)) {
                    dragon = currentDragon;
                    break;
                }
            }

            dragon.setHealth(currentHealth);
            dragon.setDamage(currentDamage);
            dragon.setArmor(currentArmor);
            currentDragons.add(dragon);
            dragonsSetByTypes.put(currentType, currentDragons);
        }

        // 3. Output printing
           dragonsSetByTypes.forEach( (type, dragons) -> {
               double damageAvg = dragons.stream().mapToInt(Dragon::getDamage).average().getAsDouble();
               double armourAvg = dragons.stream().mapToInt(Dragon::getArmor).average().getAsDouble();
               double healthAvg = dragons.stream().mapToInt(Dragon::getHealth).average().getAsDouble();
               System.out.printf("%s::(%.2f/%.2f/%.2f)\n", type, damageAvg, healthAvg, armourAvg);

               for (Dragon dragon : dragons) {
                   System.out.println(dragon);
               }
           });

    }
}
