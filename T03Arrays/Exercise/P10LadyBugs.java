package T03Arrays.Lists.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3
        //0 1
        //0 right 1
        //2 right 1
        //end

        int sizeOfTheField = Integer.parseInt(scanner.nextLine());
        int[] field = new int[sizeOfTheField];

        int[] bugsPositions = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= bugsPositions.length - 1; i++) {

            int currentBugNummer = bugsPositions[i];
            if (currentBugNummer >= 0 && currentBugNummer <= field.length - 1) {
                field[currentBugNummer] = 1;
            }

        }

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] stringArray = input.split(" ");

            int index = Integer.parseInt(stringArray[0]);
            String direction = stringArray[1];
            int flyLength = Integer.parseInt(stringArray[2]);

            if (index < 0 || index > field.length - 1 || field[index] != 1) {

                input = scanner.nextLine();
                continue;

            }

            field[index] = 0;

            switch (direction) {

                case "right":
                    index = index + flyLength;

                    while (index <= field.length - 1 && field[index] == 1) {
                        index = index + flyLength;
                    }

                    if (index <= field.length - 1) {
                        field[index] = 1;
                    }

                    break;

                case "left":
                    index = index - flyLength;

                    while (index >= 0 && field[index] == 1) {
                        index = index - flyLength;
                    }

                    if (index >= 0) {
                        field[index] = 1;
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= field.length - 1; i++) {

            System.out.print(field[i] + " ");

        }
    }
}



