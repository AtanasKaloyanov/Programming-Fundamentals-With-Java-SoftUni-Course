package T09RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04NetherRealmsSecondSolution {
    private static final String healthRegex = "[\\d\\+\\-\\*\\/.]";
    private static final String damageInitialRegex = "[\\-|\\+]?\\d+\\.?\\d*";
    private static final String damageRegex = "\\/|\\*";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String[] demons = scanner.nextLine().split("[\\s,]+");

        // 2. Health and damage computations
        Pattern damageInitialPattern = Pattern.compile(damageInitialRegex);
        Pattern damagePattern = Pattern.compile(damageRegex);

        for (String demon : demons) {
            int currentHealth = 0;
            double currentDamage = 0;

            // 2.1. Health computations
            String demonsHealth = demon.replaceAll(healthRegex, "");
            for (int i = 0; i < demonsHealth.length(); i++) {
                char currentChar = demonsHealth.charAt(i);
                currentHealth += currentChar;
            }

            // 2.2. Initial damage computations
            Matcher matcher = damageInitialPattern.matcher(demon);
            while (matcher.find()) {
                String currentGroup = matcher.group();
                double currentNumber = Double.parseDouble(currentGroup);
                currentDamage += currentNumber;
            }

            // 2.3 All damages computations
            matcher = damagePattern.matcher(demon);
            while (matcher.find()) {
                String currentOperation = matcher.group();
                if (currentOperation.equals("/")) {
                    currentDamage /= 2;
                } else if (currentOperation.equals("*")) {
                    currentDamage *= 2;
                }
            }

            // 3. Output printing:
            System.out.printf("%s - %d health, %.2f damage\n", demon, currentHealth, currentDamage);
        }
    }
}
