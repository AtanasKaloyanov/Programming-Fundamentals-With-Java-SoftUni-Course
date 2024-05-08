package T03Arrays.Lists.Exercise;

import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] stringArray = text.split(" ");
        int[] intArray = new int[stringArray.length];

        int max = Integer.MIN_VALUE;
        String string = "";
        for (int i = intArray.length - 1; i >= 0; i--) {

            intArray[i] = Integer.parseInt(stringArray[i]);
            if (intArray[i] > max) {
                max = intArray[i];
                string = string + intArray[i] + " ";
            }
        }
        String[] stringArray2 = string.split(" ");

        for (int i = stringArray2.length-1; i >= 0 ; i--) {
            System.out.print(stringArray2[i] + " ");
        }

    }
}
