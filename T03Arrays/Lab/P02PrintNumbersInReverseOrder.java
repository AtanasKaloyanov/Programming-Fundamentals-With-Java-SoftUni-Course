package T03Arrays.Lab;
import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Creating an array
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            array[i] = currentNumber;
        }

        // 3. Output printing
        for (int i = array.length - 1; i >= 0; i--) {
            int currentElement = array[i];
            System.out.print(currentElement + " ");
        }
    }
}


