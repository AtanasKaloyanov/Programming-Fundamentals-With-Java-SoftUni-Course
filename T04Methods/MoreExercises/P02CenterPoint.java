package T04Methods.MoreExercises;

import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        // 2. Calculations of the distances of the points
        double distanceToZero1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distanceToZero2 = Math.sqrt(x2 * x2 + y2 * y2);

        // 3. Output printing - 2 cases:
        if (distanceToZero2 < distanceToZero1) {
            System.out.println("(" + x2 + ", " + y2 + ")");
        } else {
            System.out.println("(" + x1 + ", " + y1 + ")");
        }
    }
}
/*
   4   .
   3
 . 2
   1
-1 0 1 2
 */