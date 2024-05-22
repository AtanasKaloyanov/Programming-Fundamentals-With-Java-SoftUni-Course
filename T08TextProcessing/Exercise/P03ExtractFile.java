package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        // 2. String processing
        int lastSymbol = path.lastIndexOf("\\");
        int secondlastSymbol = path.lastIndexOf(".");
        String fileName = path.substring(lastSymbol + 1, secondlastSymbol);
        String fileExtension = path.substring(secondlastSymbol + 1);

        // 3. Output printing:
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", fileExtension);

    }
}
    // C:\Internal\training-internal\Template.pptx

    // File name: Template
    //File extension: pptx

    // C:\Projects\Data-Structures\LinkedList.cs

    // File name: LinkedList
    // File extension: cs


