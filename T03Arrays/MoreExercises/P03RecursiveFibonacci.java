package T03Arrays.MoreExercises;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        // 1, Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Fibonacci finding via recursion
        int searchedNumber = recFib(n);

        // 2. Output printing
        System.out.println(searchedNumber);
    }

    private static int recFib(int number) {
        if (number == 2 || number == 1) {
            return 1;
        }
        return recFib(number - 1) + recFib(number - 2);
    }
}
