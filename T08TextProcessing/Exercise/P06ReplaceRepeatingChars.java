package T08TextProcessing.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char[] array = scanner.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length - 1; i++) {

            char currentChar = array[i];
            char nextChar = array[i + 1];

            if (currentChar != nextChar) {
               sb.append(currentChar);
            }
        }
        char lastChar = array[array.length - 1];
        sb.append(lastChar);

        System.out.println(sb);
    }
}
