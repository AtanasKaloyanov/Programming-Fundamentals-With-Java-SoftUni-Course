package T09RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile(">>(?<product>[A-Z][A-Za-z]+)<<(?<price>[\\d.]+)!(?<quantity>\\d+)");
        String input = scanner.nextLine();

        System.out.println("Bought furniture:");
        double sum = 0;

        while (!input.equals("Purchase")) {

            String text = input;
            Matcher matcher = pattern.matcher(input);

            double currentSum = 0;

            if (matcher.find()) {
                System.out.printf("%s%n", matcher.group("product"));

                double currentPrice = Double.parseDouble(matcher.group("price"));
                int currentQuantity = Integer.parseInt(matcher.group("quantity"));
                currentSum = currentPrice * currentQuantity;

                sum += currentSum;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f", sum);

    }
}
