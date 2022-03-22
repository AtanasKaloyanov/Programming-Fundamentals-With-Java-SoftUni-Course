package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that converts meters to kilometers formatted to the second decimal point

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = meters * 1.0 / 1000;
        System.out.printf("%.2f", kilometers);
    }
}
