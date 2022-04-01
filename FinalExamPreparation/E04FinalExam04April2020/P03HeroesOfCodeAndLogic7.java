package FinalExamPreparation.E04FinalExam04April2020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesOfCodeAndLogic7 {
    public static class Hero {
        String name;
        int HP;
        int MP;

        public Hero(String name, int HP, int MP) {
            this.name = name;
            this.HP = HP;
            this.MP = MP;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHP() {
            return HP;
        }

        public void setHP(int HP) {
            this.HP = HP;
        }

        public int getMP() {
            return MP;
        }

        public void setMP(int MP) {
            this.MP = MP;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, Hero> map = new LinkedHashMap<>();

        for (int i = 1; i <= number; i++) {

            String[] array = scanner.nextLine().split(" ");
            String heroName = array[0];
            int HP = Integer.parseInt(array[1]);
            int MP = Integer.parseInt(array[2]);

            map.putIfAbsent(heroName, new Hero(heroName, HP, MP));
            if (map.get(heroName).getHP() > 100) {
                map.get(heroName).setHP(100);
            }

            if (map.get(heroName).getMP() > 200) {
                map.get(heroName).setMP(200);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] data = input.split("\\s+-\\s+");
            String command = data[0];

            switch (command) {

                case "CastSpell":

                    String hero = data[1];
                    int MPneeded = Integer.parseInt(data[2]);
                    String spellName = data[3];

                    if (map.get(hero).getMP() >= MPneeded) {
                        int currentMP = map.get(hero).getMP();
                        map.get(hero).setMP(currentMP - MPneeded);

                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spellName, map.get(hero).getMP());

                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", hero, spellName);
                    }

                    break;

                case "TakeDamage":
                    String heroName = data[1];
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];

                    int currentHP = map.get(heroName).getHP();
                    map.get(heroName).setHP(currentHP - damage);

                    if (map.get(heroName).getHP() > 0) {

                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, map.get(heroName).getHP());
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        map.remove(heroName);
                    }

                    break;

                case "Recharge":

                    String heroN = data[1];
                    int amount = Integer.parseInt(data[2]);

                    int currentMP = map.get(heroN).getMP();
                    map.get(heroN).setMP(currentMP + amount);

                    if (map.get(heroN).getMP() > 200) {

                        map.get(heroN).setMP(200);
                        int recovey = 200 - currentMP;

                        System.out.printf("%s recharged for %d MP!%n", heroN, recovey);
                    } else {

                        System.out.printf("%s recharged for %d MP!%n", heroN, amount);
                    }

                    break;

                case "Heal":
                    String heroNa = data[1];
                    int amount2 = Integer.parseInt(data[2]);

                    int currentHP2 = map.get(heroNa).getHP();
                    map.get(heroNa).setHP(currentHP2 + amount2);

                    if (map.get(heroNa).getHP() > 100) {

                        map.get(heroNa).setHP(100);
                        int recovey = 100 - currentHP2;

                        System.out.printf("%s healed for %d HP!%n", heroNa, recovey);
                    } else {

                        System.out.printf("%s healed for %d HP!%n", heroNa, amount2);
                    }

                    break;

            }
            input = scanner.nextLine();
        }
        map.entrySet().forEach(entry -> System.out.printf("%s%nHP: %d%nMP: %d%n", entry.getKey(), entry.getValue().getHP(), entry.getValue().getMP()));

    }
}
