package T01BasicsSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P08TriangleOfNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= givenNumber; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }
}