package T08TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String[] wordsForReplacement = scanner.nextLine().split(", ");
       String text = scanner.nextLine();

        for (int i = 0; i < wordsForReplacement.length; i++) {

            String currentWord = wordsForReplacement[i];

            if (text.contains(currentWord)) {
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < currentWord.length(); j++) {
                    sb.append("*");
                }

               text = text.replace(currentWord, sb);

            }
        }

        System.out.println(text);

        //Linux, Windows
        //It is not Linux, it is GNU/Linux. Linux is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/Linux! Sincerely, a Windows client

        //It is not *****, it is GNU/*****. ***** is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/*****! Sincerely, a ******* client
    }
}
