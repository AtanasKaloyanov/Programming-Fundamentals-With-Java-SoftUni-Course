package T09RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    private static final String regex = ">>(?<product>\\w+)<<(?<price>[.\\d]+)!(?<quantity>\\d+)";
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);

        // 2. Sum calculation
        System.out.println("Bought furniture:");

        double sum = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String currentProduct = matcher.group("product");
                double currentPrice = Double.parseDouble(matcher.group("price"));
                int currentQuantity = Integer.parseInt(matcher.group("quantity"));
                System.out.println(currentProduct);
                double currentCosts = currentPrice * currentQuantity;
                sum += currentCosts;
            }

            input = scanner.nextLine();
        }

        // 3. Output printing
        System.out.printf("Total money spend: %.2f", sum);
    }
}
