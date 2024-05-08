package T03Arrays.Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");

        // 2. Finding the elements that are
        // equal via 2 nested loops and printing them
        for (String current : array2) {
            for (String currentInner : array1) {
                if (current.equals(currentInner)) {
                    System.out.print(current + " ");
                    break;
                }
            }
        }
    }
}
