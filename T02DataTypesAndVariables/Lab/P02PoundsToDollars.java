package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());

        // 2. Converting and output printing
        double dollars = pounds * 1.36;
        System.out.printf("%.3f", dollars);
    }
}
