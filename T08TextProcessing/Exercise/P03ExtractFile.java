package T08TextProcessing.Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();

        int lastSymbol = path.lastIndexOf("\\");
        int secondlastSymbol = path.lastIndexOf(".");

        System.out.printf("File name: %s%n",path.substring(lastSymbol + 1, secondlastSymbol));
        System.out.printf("File extension: %s", path.substring(secondlastSymbol + 1));

    }
}
    // C:\Internal\training-internal\Template.pptx

    // File name: Template
    //File extension: pptx

    // C:\Projects\Data-Structures\LinkedList.cs

    // File name: LinkedList
    // File extension: cs


