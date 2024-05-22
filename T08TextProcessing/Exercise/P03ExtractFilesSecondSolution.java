package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P03ExtractFilesSecondSolution {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Arrays manipulations
        String[] array = input.split("\\.");
        String[] array2 = array[0].split("\\\\");
        String fileName = array2[array2.length - 1];
        String extension = array[1];

        // 3. Output printing
        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s\n", extension);
    }
}
