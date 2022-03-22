package MidExamPreparation.E04MidExam29February2020;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());

        double weigt = Double.parseDouble(scanner.nextLine());

        boolean notFood = false;
        boolean notHay = false;
        boolean notCover = false;

        int days = 1;
        while (days <= 30) {

            food -= 0.3;
            if (food <= 0) {
                notFood = true;
                break;
            }

            if (days % 2 == 0) {
                double currentHay = 0.05 * food;
                hay -= currentHay;
                if (hay <= 0) {
                    notHay = true;
                    break;
                }
            }

            if (days % 3 == 0) {
                double currentCover = weigt / 3;
                cover -= currentCover;
                if (cover <= 0 ) {
                    notCover = true;
                    break;
                }
            }

            days++;
        }

if (notFood || notHay || notCover) {
    System.out.println("Merry must go to the pet store!");
} else {
    System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food, hay, cover);
}

    }
}
