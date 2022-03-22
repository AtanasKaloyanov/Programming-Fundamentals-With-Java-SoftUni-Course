package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       //A number is special when its sum of digits is 5, 7, or 11.
        //Write a program to read an integer n and for all numbers in the range 1…n
        // to print the number and if it is special or not (True / False).

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {

            String stringNumber = "" + i;
            int sum = 0;

            for (int j = 0; j <= stringNumber.length() - 1 ; j++) {

                char currenSymbol = stringNumber.charAt(j);
                int currentInt = Integer.parseInt("" + currenSymbol);

                sum = currentInt + sum;

            }
if (sum == 5 || sum == 7 || sum == 11) {
    System.out.printf("%d -> True%n", i);
} else {
    System.out.printf("%d -> False%n", i);
}


        }



            }
        }


