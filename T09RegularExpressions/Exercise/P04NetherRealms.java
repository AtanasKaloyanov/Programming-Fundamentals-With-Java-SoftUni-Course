package T09RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] demons = input.split("\\s*,\\s*");

        for (int i = 0; i < demons.length; i++) {
            String currentDemon = demons[i];

            String healthRegex = "[^ \\/\\d+*.-]";
            Pattern healthPattern = Pattern.compile(healthRegex);
            Matcher matcher = healthPattern.matcher(currentDemon);

            StringBuilder sb = new StringBuilder();
            while (matcher.find()) {
                sb.append(matcher.group());
            }

            int demonsHealth = 0;

            for (int j = 0; j < sb.length(); j++) {
                char currntChar = sb.charAt(j);
                demonsHealth += currntChar;
            }

            String damageRegex = "[\\+|\\-]?\\d+\\.?\\d*";
            Pattern damagePattern = Pattern.compile(damageRegex);
            Matcher damageMatcher = damagePattern.matcher(currentDemon);

            double demonsDamage = 0;

            while (damageMatcher.find()) {
                double currentDamage = Double.parseDouble(damageMatcher.group());
                demonsDamage += currentDamage;
            }

            String operator = "[\\*\\/]";
            Pattern operationPattern = Pattern.compile(operator);
            Matcher operationMatcher = operationPattern.matcher(currentDemon);


            while (operationMatcher.find()) {
                if (operationMatcher.group().equals("/")) {
                    demonsDamage = demonsDamage / 2;
                } else {
                    demonsDamage = demonsDamage * 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", currentDemon, demonsHealth, demonsDamage);
        }
    }
}
