package T04Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String givenString = scanner.nextLine();
        System.out.println(countVowels(givenString));

    }
    public static int countVowels(String givenString) {

        givenString = givenString.toLowerCase();
        int count = 0;
        for (int i = 0; i <= givenString.length() - 1 ; i++) {
            char currentChar = givenString.charAt(i);
            if (currentChar =='a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count ++;
            }
        }
        return count;
    }
}
