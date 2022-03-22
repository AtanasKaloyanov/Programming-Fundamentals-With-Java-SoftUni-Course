package T03Arrays.Lists.Exercise;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that receives an array and the number of rotations you have to perform
        // (the first element goes at the end) Print the resulting array.

       String input = scanner.nextLine();
       String[] array = input.split(" ");

       int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotation ; i++) {

            String firstElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {

                array[j] = array[j + 1];

            }

            array[array.length-1] = firstElement;


        }

        for (String string : array) {
            System.out.print(string + " ");
        }




    }
}














