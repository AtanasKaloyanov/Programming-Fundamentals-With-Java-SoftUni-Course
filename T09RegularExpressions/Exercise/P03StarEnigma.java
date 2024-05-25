package T09RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03StarEnigma {
    private static final String regex = "^[^-@!:>]*?@(?<planet>[A-Za-z]+)[^-@!:>]*?:(?<population>\\d+)[^-@!:>]*?!(?<type>A|D)![^-@!:>]*?\\->(?<soldiers>\\d+)[^-@!:>]*?$";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2.
        Set<String> attackedPlanets = new TreeSet<>();
        Set<String> destroyedPlanets = new TreeSet<>();

        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String currentText = scanner.nextLine();
            int charSum = sumCounting(currentText);
            String decryptedMessage = decrypt(currentText, charSum);
            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {
                String attackType = matcher.group("type");
                String planetName = matcher.group("planet");
                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(planetName);
                }
            }
        }

        // 3. Output printing
        int attackedPlanetsNumber = attackedPlanets.size();
        System.out.printf("Attacked planets: %d\n", attackedPlanetsNumber);
        for (String attackedPlanet : attackedPlanets) {
            System.out.printf("-> %s\n", attackedPlanet);
        }

        int destroyedPlanetsNumber = destroyedPlanets.size();
        System.out.printf("Destroyed planets: %d\n", destroyedPlanetsNumber);
        for (String destroyedPlanet : destroyedPlanets) {
            System.out.printf("-> %s\n", destroyedPlanet);
        }
    }

    private static String decrypt(String currentText, int charSum) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < currentText.length(); j++) {
            char currentChar = currentText.charAt(j);
            currentChar -= charSum;
            sb.append(currentChar);
        }
        return sb.toString();
    }

    private static int sumCounting(String currentText) {
        String textToLowercase = currentText.toLowerCase();
        int charsSum = 0;
        for (int j = 0; j < textToLowercase.length(); j++) {
            char currentChar = textToLowercase.charAt(j);
            if (currentChar == 's' || currentChar == 't' ||
                    currentChar == 'a' || currentChar == 'r') {
                charsSum++;
            }
        }
        return charsSum;
    }
}
