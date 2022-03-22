package MidExamPreparation.E06MidExamRetake;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int daylyPlunder = Integer.parseInt(scanner.nextLine());
        double expextedPlunder = Double.parseDouble(scanner.nextLine());

        int counter = 1;
        double totalPlunder = 0;

        while (counter <= days) {

            if (counter % 3 == 0) {
                totalPlunder = totalPlunder + 1.5 * daylyPlunder;
            } else {
                totalPlunder += daylyPlunder;
            }
            if (counter % 5 == 0) {
                totalPlunder *= 0.7;
            }

            counter++;
        }

        if (totalPlunder >= expextedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            double percentage = totalPlunder / expextedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
