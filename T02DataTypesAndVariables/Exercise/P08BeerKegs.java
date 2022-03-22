package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program, which calculates the volume of n beer kegs.
        //You will receive in total 3 * n lines. Every three lines will hold information for a single keg.
        //First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
        //Calculate the volume using the following formula: π * r^2 * h.
        //In the end, print the model of the biggest keg.

        int counts = Integer.parseInt(scanner.nextLine());
        double biggest = Double.MIN_VALUE;

        String biggestKeg = "";

        for (int i = 1; i <= counts ; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

           double volume = Math.PI * radius * radius * height;
                    if (volume > biggest) {
                        biggest = volume;
                        biggestKeg = model;
                    }

        }
        System.out.println(biggestKeg);
    }
}
