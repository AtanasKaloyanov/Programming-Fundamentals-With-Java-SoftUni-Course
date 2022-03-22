package T08TextProcessing.Lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // hi abc add
        //hihiabcabcabcaddaddadd

        String[] givenArray = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < givenArray.length; i++) {
            String currentWord = givenArray[i];

            for (int j = 0; j < currentWord.length(); j++) {
                sb.append(currentWord);
            }
        }
        System.out.println(sb);

    }
}
