package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        String firstString = data[0];
        String secondString = data[1];

        int value = 0;

        if (firstString.length() >= secondString.length()) {
           resultCalculation(firstString, secondString, value);
        } else {
          resultCalculation(secondString, firstString, value);
        }

    }

    public static void resultCalculation(String firstString, String secondString, int value) {
        for (int i = 0; i <= firstString.length() - 1; i++) {
            char currentCharFirstString = firstString.charAt(i);

            if (i > secondString.length() - 1) {
                value = value + currentCharFirstString;
            }

            for (int j = 0; j <= secondString.length() - 1; j++) {

                char currentCharSecondString = secondString.charAt(j);

                if (i == j) {
                    value = value + currentCharFirstString * currentCharSecondString;
                }
            }
        }
        System.out.println(value);
    }

}
