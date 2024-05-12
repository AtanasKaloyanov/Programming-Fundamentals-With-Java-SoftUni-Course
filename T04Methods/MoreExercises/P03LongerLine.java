package T04Methods.MoreExercises;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        // 2. Finding the distance between point1 and point2 and
        // the distance between point3 and point4
        double distance1 = calcDistance(x1, y1, x2, y2);
        double distance2 = calcDistance(x3, y3, x4, y4);

        // 3. Printing the points that have longer distance. The first should be
        // the point that is closer to position (0,0);
        if (distance2 > distance1) {
            resultPrinting(x3, y3, x4, y4);
        } else {
            resultPrinting(x1, y1, x2, y2);
        }
    }
    private static double calcDistance(int x1, int y1, int x2, int y2) {
        int xDistance = Math.abs(x1 - x2);
        int yDistance = Math.abs(y1 - y2);
        double pointsDistance = Math.sqrt(xDistance * xDistance + yDistance * yDistance);
        return pointsDistance;
    }
    public static void resultPrinting(int x1, int y1, int x2, int y2) {
        double distanceToZero1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distanceToZero2 = Math.sqrt(x2 * x2 + y2 * y2);

        if (distanceToZero2 < distanceToZero1) {
            System.out.println("(" + x2 + ", " + y2 + ")(" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x1 + ", " + y1 + ")(" + x2 + ", " + y2 + ")");
        }
    }
}




