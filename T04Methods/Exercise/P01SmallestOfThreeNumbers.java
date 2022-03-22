package T04Methods.Exercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestNumber(firstNumber, secondNumber, thirdNumber));
    }

    public static int smallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int min = Integer.MAX_VALUE;
        if (firstNumber < min) {
            min = firstNumber;
        } if (secondNumber < min) {
            min = secondNumber;
        } if (thirdNumber < min){
            min = thirdNumber;
        }
        return min;
    }
}
