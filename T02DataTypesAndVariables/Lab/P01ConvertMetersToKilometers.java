package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());

        // 2. Converting and printing
        double km = meters * 1.0 / 1000;
        System.out.printf("%.2f", km);
    }
}
