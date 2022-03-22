package T08TextProcessing.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //helLo
        //Softuni
        //bottle
        //end

        //helLo = oLleh
        //Softuni = inutfoS
        //bottle = elttob

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            StringBuilder sb = new StringBuilder();
            sb.append(input);
            sb.reverse();

            System.out.printf("%s = %s%n", input, sb.toString());

            input = scanner.nextLine();
        }


    }
}
