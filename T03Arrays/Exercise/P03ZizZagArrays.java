package T03Arrays.Lists.Exercise;

import java.util.Scanner;

public class P03ZizZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Write a program that creates 2 arrays.
        // You will be given an integer n. On the next n lines,
        // you get 2 integers. Form 2 arrays as shown below.

        int number = Integer.parseInt(scanner.nextLine());
        String string = "";


       for (int i = 0; i < number; i++) {

            String text = scanner.nextLine();
            String[] stringArray = text.split(" ");


            if (i % 2 == 0) {
                System.out.print(stringArray[0] + " ");
                string = string + stringArray[1] + " ";

            } else {
                System.out.print(stringArray[1] + " ");
                string = string + stringArray[0] + " ";
            }

        }
        System.out.println();
        System.out.println(string);
        }

    }


