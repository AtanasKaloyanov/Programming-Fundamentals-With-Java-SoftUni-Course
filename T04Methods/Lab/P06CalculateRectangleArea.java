package T04Methods.Lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(rectangleArea(width, length));
    }

    public static Integer rectangleArea(int width, int length) {
        return width * length;
    }
}
