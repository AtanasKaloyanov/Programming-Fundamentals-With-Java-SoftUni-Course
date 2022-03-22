package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P01ValidUserNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(", ");

        for (int i = 0; i < array.length; i++) {
            String currentWord = array[i];

            if (currentWord.length() >= 3 && currentWord.length() <= 16) {

                boolean isValid = true;
                for (int j = 0; j < currentWord.length(); j++) {
                    char currentChar = currentWord.charAt(j);

                    boolean isLetter = Character.isLetter(currentChar);
                    boolean isNumber = Character.isDigit(currentChar);
                    boolean isHyphen = currentChar == 45;
                    boolean isUnderscope = currentChar == 95;

                    if (!(isLetter || isNumber || isHyphen || isUnderscope)) {
                        isValid = false;
                        break;
                    }

                }

                if (isValid) {
                    System.out.println(currentWord);
                }

            }

        }
        //3 - 16 characters
        //contains only letters, numbers, hyphens and underscores

        //sh, too_long_username, !lleg@l ch@rs, jeffbutt
        //jeffbutt

        //Jeff, john45, ab, cd, peter-ivanov, @smith
        //Jeff
        //John45
        //peter-ivanov
    }
}
