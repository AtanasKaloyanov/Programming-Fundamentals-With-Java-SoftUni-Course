package T07AssociateArraysDictionaries.MoreExercises;

import java.util.*;

public class P04Snowwhite {
    static class Dwarf {
        private String name;
        private String color;
        private int height;

        public Dwarf(String name, String color, int height) {
            this.name = name;
            this.color = color;
            this.height = height;
        }

        public int getHeight() {
            return this.height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getColor() {
            return this.color;
        }

        public String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. While cycle
        //  name+color
        Map<String, Dwarf> dwarfsByNameAndColor = new LinkedHashMap<>();
        //  color
        Map<String, Set<Dwarf>> dwarfsSetByColor = new LinkedHashMap<>();

        while (!input.equals("Once upon a time")) {
            String[] currentArray = input.split(" <:> ");
            String currentName = currentArray[0];
            String currentColor = currentArray[1];
            int currentHeight = Integer.parseInt(currentArray[2]);

            // 2.1. Dwarf adding by 2 a key that consist 2 dwarf's fields
            String namePlusColor = currentName + ":" + currentColor;
            Dwarf currentDwarf;
            if (dwarfsByNameAndColor.containsKey(namePlusColor)) {
                currentDwarf = dwarfsByNameAndColor.get(namePlusColor);
                if (currentHeight > currentDwarf.getHeight()) {
                    currentDwarf.setHeight(currentHeight);
                    dwarfsByNameAndColor.put(namePlusColor, currentDwarf);
                }
            } else {
                currentDwarf = new Dwarf(currentName, currentColor, currentHeight);
                dwarfsByNameAndColor.put(namePlusColor, currentDwarf);
            }

            dwarfsSetByColor.putIfAbsent(currentColor, new LinkedHashSet<>());
            dwarfsSetByColor.get(currentColor).add(currentDwarf);

            input = scanner.nextLine();
        }

        // 3. Output printing
        dwarfsByNameAndColor.values().stream()
                .sorted( (dwarf1, dwarf2) -> {
                    int height1 = dwarf1.getHeight();
                    int height2 = dwarf2.getHeight();
                    int result = Integer.compare(height2, height1);
                    if (result == 0) {
                        Set<Dwarf> dwarfsByColors1 = dwarfsSetByColor.get(dwarf1.getColor());
                        Set<Dwarf> dwarfsByColors2 = dwarfsSetByColor.get(dwarf2.getColor());
                        int sameColorsNumber1 = dwarfsByColors1.size();
                        int sameColorsNumber2 = dwarfsByColors2.size();
                        result = Integer.compare(sameColorsNumber2, sameColorsNumber1);
                    }
                    return result;
                }).forEach( (dwarf -> {
                    String currentColor = dwarf.getColor();
                    String currentName = dwarf.getName();
                    int currentHeight = dwarf.getHeight();
                    System.out.printf("(%s) %s <-> %d\n", currentColor, currentName, currentHeight);
                }));
    }
}
