package T04Methods.Exercise;
import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Output printing via 2 nested loops
        for (int i = 1; i <= n; i++) {
            String numberAsString = String.valueOf(i);
            int sum = 0;
            boolean hasOddDigit = false;
            for (int j = 0; j < numberAsString.length(); j++) {
                int currentDigit = getCurrentDigit(numberAsString, j);
                sum += currentDigit;

                if (currentDigit % 2 != 0) {
                    hasOddDigit = true;
                }
            }

            numberPrinting(i, sum, hasOddDigit);
        }
    }

    private static void numberPrinting(int i, int sum, boolean hasOddDigit) {
        if (sum % 8 == 0 && hasOddDigit) {
            System.out.println(i);
        }
    }
    private static int getCurrentDigit(String numberAsString, int j) {
        char currentChar = numberAsString.charAt(j);
        int currentDigit = Integer.parseInt(String.valueOf(currentChar));
        return currentDigit;
    }
}

