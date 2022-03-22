package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that converts British pounds to US dollars formatted to 3th decimal point
        //1 British Pound = 1.31 Dollars

        double paunds = Double.parseDouble(scanner.nextLine());
        double dolars = paunds * 1.36;

        System.out.printf("%.3f", dolars);


    }
}
