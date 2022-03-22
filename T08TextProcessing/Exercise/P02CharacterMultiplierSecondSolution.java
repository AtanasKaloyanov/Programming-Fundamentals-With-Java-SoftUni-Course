package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P02CharacterMultiplierSecondSolution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] givenArray = scanner.nextLine().split(" ");
        char[] firstCharArray = givenArray[0].toCharArray();
        char[] secondCharArray = givenArray[1].toCharArray();

        int smallerLength = Math.min(firstCharArray.length, secondCharArray.length);
        int biggerLength = Math.max(firstCharArray.length, secondCharArray.length);

       int result = 0;

        for (int i = 0; i < biggerLength ; i++) {

            if (i < smallerLength) {
                result += firstCharArray[i] * secondCharArray[i];
            } else  {
                if (firstCharArray.length > secondCharArray.length) {
                    result += firstCharArray[i];
                } else {
                    result += secondCharArray[i];
                }
            }

        }

        System.out.println(result);

        // George Peter

        // G e o r g e
        // P e t e r


        // 123 522

        // 1 2 3
        // 5 2 2

        // love SoftUni

        // S o f t U n i
        // l o v e
    }
}
