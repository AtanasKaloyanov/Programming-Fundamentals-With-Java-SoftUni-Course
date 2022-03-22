package T04Methods.Exercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        pyramide(number);

    }

    public static void pyramide(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(number + " ");
                if (j == number) {
                    System.out.println();
                }
            }
        }
    }
}
