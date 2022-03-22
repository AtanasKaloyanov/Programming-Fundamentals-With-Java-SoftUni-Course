package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < input.length() ; i++) {

            char currentChar = input.charAt(i);
            int changedCharValue = (int) currentChar + 3;
            char changedChar = (char) changedCharValue;
            sb.append(changedChar);

        }
        System.out.println(sb);
    }
}
