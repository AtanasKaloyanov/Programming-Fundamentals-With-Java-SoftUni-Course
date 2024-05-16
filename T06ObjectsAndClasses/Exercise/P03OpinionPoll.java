package T06ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class P03OpinionPoll {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Result printing
        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split(" ");
            int currentAge = Integer.parseInt(currentArray[1]);

            if (currentAge > 30) {
                String currentName = currentArray[0];
                System.out.printf("%s - %d\n", currentName, currentAge);
            }
        }
    }
}
