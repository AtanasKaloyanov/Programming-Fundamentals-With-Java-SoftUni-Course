package T09RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInputs = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        int attackedNumber = 0;
        int destroyedNumber = 0;

        for (int i = 1; i <= numberInputs; i++) {
            String input = scanner.nextLine();

            int counter = 0;
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);

                if (currentChar == 115 || currentChar == 116 || currentChar == 97 || currentChar == 114 ||
                        currentChar == 83 || currentChar == 84 || currentChar == 65 || currentChar == 82) {
                    counter++;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                char modifiedChar = (char) (currentChar - counter);

                sb.append(modifiedChar);
            }

            String regex = "^[^-@!:]*?@(?<planet>[a-zA-Z]+)[^-@!:]*?:(?<population>\\d+)[^-@!:]*?!(?<type>[A|D])![^-@!:]*?\\->(?<soldier>\\d+)[^-@!:]*?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb);

            while (matcher.find()) {
                if (matcher.group("type").equals("A")) {
                     String currentAttackedPlanet = matcher.group("planet");
                     attackedPlanets.add(currentAttackedPlanet);
                     attackedNumber++;
                } else if (matcher.group("type").equals("D")) {
                    String currentDestroyedPlanet = matcher.group("planet");
                    destroyedPlanets.add(currentDestroyedPlanet);
                    destroyedNumber++;
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attackedNumber);;
        if (attackedNumber != 0) {
            Collections.sort(attackedPlanets);
            for (String planet : attackedPlanets) {
                System.out.printf("-> %s%n", planet);
            }
        }

        System.out.printf("Destroyed planets: %d%n", destroyedNumber);
        if (destroyedNumber != 0) {
            Collections.sort(destroyedPlanets);
            for (String planet : destroyedPlanets) {
                System.out.printf("-> %s%n", planet);
            }
        }
    }
}
