package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        // 2. String processing
        int strength = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (strength > 0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                strength--;
                i--;
            } else if (sb.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
            }

        }

        // 3. Output printing
        System.out.println(sb);
    }
}
