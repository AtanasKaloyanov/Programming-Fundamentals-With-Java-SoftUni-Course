package T04Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String text = scanner.nextLine();
       int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedPrint(text, n));
    }

    public static String repeatedPrint(String text, int n) {

       String finalString = "";
        for (int i = 1; i <= n ; i++) {
            finalString = finalString + text;
        }
        return finalString;
    }

}
