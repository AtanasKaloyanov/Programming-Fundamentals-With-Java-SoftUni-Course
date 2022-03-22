package T04Methods.Lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= givenNumber; i++) {
            printPyramid(1, i);
        }

        for (int i = givenNumber - 1; i >= 1; i--) {
            printPyramid(1, i);
        }
    }

    public static void printPyramid(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
