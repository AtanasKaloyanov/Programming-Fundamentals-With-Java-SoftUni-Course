package T03Arrays.Lists.Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] stringArray = text.split( " ");
        int[] firstArray = new int [stringArray.length];


        for (int i = 0; i < firstArray.length; i++) {

            firstArray[i] = Integer.parseInt(stringArray[i]);

        }


        int[] secondArray = new int [firstArray.length - 1];



        for (int i = 0; i < secondArray.length - 1; i++) {
            secondArray [i] = firstArray [i + 1];

            System.out.println(secondArray[i]);

        }

    }
}






