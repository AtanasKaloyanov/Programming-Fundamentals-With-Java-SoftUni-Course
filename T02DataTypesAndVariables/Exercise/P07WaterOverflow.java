package T02DataTypesAndVariables.Exercise;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You have a water tank with a capacity of 255 liters.
        //On the next n lines, you will receive liters of water, which you have to pour into your tank.
        //If the capacity is not enough, print "Insufficient capacity!"
        // and continue reading the next line. On the last line, print the liters in the tank.

        int lines = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int lastedLitres = capacity;


        for (int i = 1; i <= lines; i++) {

            int quantities = Integer.parseInt(scanner.nextLine());
            if (quantities > lastedLitres) {
                System.out.println("Insufficient capacity!");
            } else {
                lastedLitres = lastedLitres - quantities;
            }
        }

        int searchedLitres = capacity - lastedLitres;
        System.out.println(searchedLitres);

    }
}
