package T04Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double givenNumber = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.#######");

        double answer = exponentiation(givenNumber,power);

        System.out.println(df.format(answer));
    }

    public static double exponentiation (double givenNumber, int power) {
     double result = 1;

        for (int i = 1; i <= power ; i++) {
            result = givenNumber * result;
        }
           return result;
    }

}
