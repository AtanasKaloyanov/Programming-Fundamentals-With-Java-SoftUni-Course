package T03Arrays.Lists.Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program, which prints common elements in two arrays.
        // You have to compare the elements of the second array to the elements of the first.

         String givenText = scanner.nextLine();
         String secondGivenText = scanner.nextLine();

         String[] firstArray = givenText.split(" ");
         String[] secondArray = secondGivenText.split(" ");

        for (int i = 0; i < firstArray.length ; i++) {
           String currentElement = firstArray[i];
            for (int j = 0; j < secondArray.length ; j++) {
                String currentElement2 = secondArray[j];
                if (currentElement.equals(currentElement2)) {
                    System.out.print(currentElement2 + " ");
                }
            }


        }



    }
}
