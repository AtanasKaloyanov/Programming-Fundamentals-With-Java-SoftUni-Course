package T02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        // 2. Output printing
        System.out.printf("Town %s has population of %d and area %d square km.", townName, population, area);
    }
}
