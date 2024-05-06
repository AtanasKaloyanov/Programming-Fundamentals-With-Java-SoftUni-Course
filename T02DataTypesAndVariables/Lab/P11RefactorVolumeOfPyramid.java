package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        // 2. Volume calculating
        double volume = (length * width * height) / 3;

        // 3. Output printing
        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);
    }
}
