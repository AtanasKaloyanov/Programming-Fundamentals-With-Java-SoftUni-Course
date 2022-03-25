package T09RegularExpressions.Exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigmaSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String starRegex = "[starSTAR]";
        Pattern starPattern = Pattern.compile(starRegex);

        String regex = "^[^@\\-!:>]*@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<people>[\\d]+)[^@\\-!:>]*!(?<type>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)[^@\\-!:>]*$";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new LinkedList<>();
        List<String> destroyedPlanets = new LinkedList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String information = scanner.nextLine();
            Matcher starMatcher = starPattern.matcher(information);
            int count = 0;
            while (starMatcher.find()) {
                count++;
            }
            StringBuilder sb = new StringBuilder(information);
            for (int j = 0; j < sb.length(); j++) {
                int newChar = sb.charAt(j) - count;
                sb.setCharAt(j, (char) newChar);
            }

            Matcher matcher = pattern.matcher(sb);
            if (matcher.matches()) {
                String planetName = matcher.group("planet");
                String operation = matcher.group("type");

                if (operation.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        attackedPlanets.stream().sorted(String::compareTo).forEach(p -> System.out.printf("-> %s%n", p));

        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        destroyedPlanets.stream().sorted(String::compareTo).forEach(p -> System.out.printf("-> %s%n", p));
    }
}
