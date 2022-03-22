package T04Methods.Exercise;


import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String givenString = scanner.nextLine();

        middleChars(givenString);

    }

    public static void middleChars( String givenString) {

        if (givenString.length() % 2 == 0) {

            char firstMiddleChar = givenString.charAt(givenString.length() / 2 - 1);
            char secondMiddleChar = givenString.charAt(givenString.length() / 2 );

            System.out.print(firstMiddleChar);
            System.out.print(secondMiddleChar);

        } else {
            int position = givenString.length() / 2 ;
            char middleChar = givenString.charAt(position);

            System.out.println(middleChar);
        }

    }
}
