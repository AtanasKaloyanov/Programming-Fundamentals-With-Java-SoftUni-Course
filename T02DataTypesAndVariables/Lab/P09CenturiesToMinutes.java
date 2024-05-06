package T02DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P09CenturiesToMinutes {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());

        // 2. 4 calculations
        int years = centuries * 100;
        BigDecimal days = new BigDecimal(years * 365.2422);
        BigDecimal hours = days.multiply(BigDecimal.valueOf(24));
        BigDecimal minutes = hours.multiply(BigDecimal.valueOf(60));

        // 3. Output
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
    }
}
