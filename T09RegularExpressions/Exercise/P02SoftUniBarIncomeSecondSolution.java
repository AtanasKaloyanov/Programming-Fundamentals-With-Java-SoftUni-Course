package T09RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02SoftUniBarIncomeSecondSolution {
    private static final String regex = "%(?<person>[A-Z][a-z]+)%[^|$.%]*?<(?<product>\\w+)>[^|$.%]*\\|(?<count>\\d+)\\|[^|$.%]*?(?<price>\\d+\\.?\\d+)\\$";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double sum = 0;
        // 2. Sum calculation
        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String currentPerson = matcher.group("person");
                String currentProduct = matcher.group("product");
                int currentCount = Integer.parseInt(matcher.group("count"));
                double currentPrice = Double.parseDouble(matcher.group("price"));
                double currentCosts = currentCount * currentPrice;

                sum += currentCosts;
                System.out.printf("%s: %s - %.2f\n", currentPerson, currentProduct, currentCosts);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);
    }
}
