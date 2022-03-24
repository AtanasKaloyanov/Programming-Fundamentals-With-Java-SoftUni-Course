package T09RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String regex = "%(?<customer>[A-Z][a-z]+)%[^|$.%]*?<(?<product>\\w+)>[^|$.%]*\\|(?<quantity>\\d+)\\|[^|$.%]*?(?<price>\\d+\\.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        double totalSum = 0;

        while (!input.equals("end of shift")) {
            String text = input;
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                int currentQuntity = Integer.parseInt(matcher.group("quantity"));
                double currentPrice = Double.parseDouble(matcher.group("price"));
                double currentSum = currentQuntity * currentPrice;

                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"), matcher.group("product"), currentSum);
                totalSum += currentSum;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}

