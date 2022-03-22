package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yieldOfTheMine = Integer.parseInt(scanner.nextLine());
        int days = 0;

        int lastSpice = yieldOfTheMine;
        int sum = 0;

        if (yieldOfTheMine < 100) {
            System.out.println(days);
            System.out.println(sum);
        } else {
            while (yieldOfTheMine >= 100) {
                days++;

                lastSpice = lastSpice - 26;

                sum = lastSpice + sum;

                yieldOfTheMine = yieldOfTheMine - 10;
                lastSpice = yieldOfTheMine;

            }
            System.out.println(days);
            System.out.println(sum - 26);


        }
    }
}