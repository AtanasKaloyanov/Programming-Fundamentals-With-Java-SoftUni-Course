package T06ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P03BigFactorial {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger result = new BigInteger(String.valueOf(n));

        // 2.  0 and 1 Check
        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        }

        // 3. Iterative factorial algorithm
        for (int i = n - 1; i >= 1; i--) {
            BigInteger current = new BigInteger(String.valueOf(i));
            result = result.multiply(current);
        }

        // 4. Result printing
        System.out.println(result);
    }
}
