package T04Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringNumbers = scanner.nextLine();

        int[] array = Arrays
                .stream(stringNumbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] currentArray = input.split(" ");
            String command = currentArray[0];

            switch (command) {
                case "exchange":

                    int endNumber = Integer.parseInt(currentArray[1]);

                    if (endNumber < 0 || endNumber > array.length - 1) {
                        System.out.println("Invalid index");
                    } else {
                        int lastElement = Integer.parseInt(currentArray[1]);
                        int[] firstArray = new int[lastElement + 1];

                        for (int i = 0; i <= lastElement; i++) {
                            firstArray[i] = array[i];
                        }

                        int[] secondArray = new int[array.length - lastElement - 1];

                        for (int i = 0; i <= secondArray.length - 1; i++) {
                            secondArray[i] = array[i + lastElement + 1];
                        }

                        for (int i = 0; i <= array.length - 1; i++) {
                            if (i < secondArray.length) {
                                array[i] = secondArray[i];
                            } else {
                                array[i] = firstArray[i - secondArray.length];
                            }
                        }

                    }
                    break;

                case "max":
                    if (currentArray[1].equals("even")) {

                        int maxEvenDigit = Integer.MIN_VALUE;
                        int maxEvenPosition = -1;

                        for (int i = 0; i <= array.length - 1; i++) {
                            int currentElement = array[i];
                            if (currentElement % 2 == 0 && currentElement >= maxEvenDigit) {
                                maxEvenDigit = currentElement;
                                maxEvenPosition = i;
                            }
                        }

                        if (maxEvenPosition == -1) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(maxEvenPosition);
                        }
                    }

                    if (currentArray[1].equals("odd")) {

                        int maxOdd = Integer.MIN_VALUE;
                        int maxOddPosition = -1;


                        for (int i = 0; i <= array.length - 1; i++) {

                            int currentElement = array[i];
                            if (currentElement % 2 != 0 && currentElement >= maxOdd) {
                                maxOdd = currentElement;
                                maxOddPosition = i;
                            }
                        }

                        if (maxOddPosition == -1) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(maxOddPosition);
                        }
                    }

                    break;

                case "min":
                    if (currentArray[1].equals("even")) {

                        int minEven = Integer.MAX_VALUE;
                        int minEvenPosition = -1;

                        for (int i = 0; i <= array.length - 1; i++) {

                            int currentElement = array[i];
                            if (currentElement % 2 == 0 && currentElement <= minEven) {
                                minEven = currentElement;
                                minEvenPosition = i;
                            }
                        }

                        if (minEvenPosition == -1) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(minEvenPosition);
                        }

                    }

                    if (currentArray[1].equals("odd")) {

                        int minOdd = Integer.MAX_VALUE;
                        int minOddPosition = -1;

                        for (int i = 0; i <= array.length - 1; i++) {

                            int currentElement = array[i];
                            if (currentElement % 2 != 0 && currentElement <= minOdd) {
                                minOdd = currentElement;
                                minOddPosition = i;
                            }
                        }

                        if (minOddPosition == -1) {
                            System.out.println("No matches");
                        } else {
                            System.out.println(minOddPosition);
                        }

                    }
                    break;

                case "first":
                    if (currentArray[2].equals("even")) {

                        int number = Integer.parseInt(currentArray[1]);

                        if (number > array.length) {
                            System.out.println("Invalid count");
                        } else {
                            String firstEvenString = "";
                            int counter = 0;

                            for (int i = 0; i <= array.length - 1; i++) {

                                int currentElement = array[i];
                                if (currentElement % 2 == 0) {
                                    firstEvenString = firstEvenString + currentElement;
                                    counter++;
                                    if (counter == number) {
                                        break;
                                    }
                                }
                            }

                            if (firstEvenString.equals("")) {
                                System.out.println("[]");
                            } else {
                                int[] firstEvenArray = Arrays
                                        .stream(firstEvenString.split(""))
                                        .mapToInt(Integer::parseInt)
                                        .toArray();

                                System.out.println(Arrays.toString(firstEvenArray));
                            }
                        }
                    }

                    if (currentArray[2].equals("odd")) {
                        int number = Integer.parseInt(currentArray[1]);

                        if (number > array.length) {
                            System.out.println("Invalid count");
                        } else {
                            String firstOddString = "";
                            int counter = 0;

                            for (int i = 0; i <= array.length - 1; i++) {

                                int currentElement = array[i];
                                if (currentElement % 2 != 0) {
                                    firstOddString = firstOddString + currentElement;
                                    counter++;
                                    if (counter == number) {
                                        break;
                                    }
                                }
                            }

                            if (firstOddString.equals("")) {
                                System.out.println("[]");
                            } else {
                                int[] firstOddArray = Arrays
                                        .stream(firstOddString.split(""))
                                        .mapToInt(Integer::parseInt)
                                        .toArray();

                                System.out.println(Arrays.toString(firstOddArray));
                            }
                        }
                    }

                    break;

                case "last":
                    if (currentArray[2].equals("even")) {
                        int number = Integer.parseInt(currentArray[1]);

                        if (number > array.length) {
                            System.out.println("Invalid count");
                        } else {
                            String lastEvenString = "";
                            int counter = 0;

                            for (int i = array.length - 1; i >= 0; i--) {

                                int currentElement = array[i];
                                if (currentElement % 2 == 0) {
                                    lastEvenString = lastEvenString + currentElement;
                                    counter++;
                                    if (counter == number) {
                                        break;
                                    }
                                }
                            }

                            if (lastEvenString.equals("")) {
                                System.out.println("[]");
                            } else {
                                int[] lastEvenArray = Arrays
                                        .stream(lastEvenString.split(""))
                                        .mapToInt(Integer::parseInt)
                                        .toArray();

                                System.out.println(Arrays.toString(lastEvenArray));
                            }
                        }
                    }

                    if (currentArray[2].equals("odd")) {
                        int number2 = Integer.parseInt(currentArray[1]);

                        if (number2 > array.length) {
                            System.out.println("Invalid count");
                        } else {
                            String lastOddString = "";
                            int counter = 0;

                            for (int i = array.length - 1; i >= 0; i--) {

                                int currentElement = array[i];
                                if (currentElement % 2 != 0) {
                                    lastOddString = lastOddString + currentElement;
                                    counter++;
                                    if (counter == number2) {
                                        break;
                                    }
                                }
                            }
                            if (lastOddString.equals("")) {
                                System.out.println("[]");
                            } else {
                                int[] firstEvenArray = Arrays
                                        .stream(lastOddString.split(""))
                                        .mapToInt(Integer::parseInt)
                                        .toArray();

                                System.out.println(Arrays.toString(firstEvenArray));
                            }
                        }
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }
}
