package T04Methods.MoreExercises;

import java.util.*;

public class P06ArrayManipulator {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readArray(scanner);

        // 2. Commands implementation
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] array = input.split(" ");
            String command = array[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(array[1]);
                    if (index < 0 || index >= numbers.length) {
                        System.out.println("Invalid index");
                        input = scanner.nextLine();
                        continue;
                    }

                    exchangeElements(numbers, index);
                    break;
                case "max":
                    String evenOrOdd = array[1];
                    int bestMaxIndex = getBestMaxIndex(numbers, evenOrOdd);
                    bestIndexPrinting(bestMaxIndex);
                    break;
                case "min":
                    String secondCommand = array[1];
                    int bestMinIndex = getBestMinIndex(numbers, secondCommand);
                    bestIndexPrinting(bestMinIndex);
                    break;
                case "first":
                    int firstCount = Integer.parseInt(array[1]);
                    if (firstCount > numbers.length) {
                        System.out.println("Invalid count");
                        input = scanner.nextLine();
                        continue;
                    }

                    String secCommand = array[2];
                    List<Integer> firstResult = getFirstNumbers(numbers, firstCount, secCommand);
                    System.out.println(firstResult);
                    break;
                case "last":
                    int lastCount = Integer.parseInt(array[1]);
                    if (lastCount > numbers.length) {
                        System.out.println("Invalid count");
                        input = scanner.nextLine();
                        continue;
                    }

                    String command2 = array[2];
                    List<Integer> lastResult = getLastNumbers(numbers, lastCount, command2);

                    Collections.reverse(lastResult);
                    System.out.println(lastResult);
                    break;
            }

            input = scanner.nextLine();
        }

        // 3. Final array printing
        System.out.println(Arrays.toString(numbers));
    }

    private static List<Integer> getLastNumbers(int[] numbers, int lastCount, String command2) {
        List<Integer> lastResult = new ArrayList<>();
        int lastCounter = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0 &&  command2.equals("even")) {
                lastResult.add(currentNumber);
                lastCounter++;
            } else if (currentNumber % 2 != 0 &&  command2.equals("odd")) {
                lastResult.add(currentNumber);
                lastCounter++;
            }

            if (lastCounter == lastCount) {
                break;
            }
        }

        return lastResult;
    }

    private static List<Integer> getFirstNumbers(int[] numbers, int firstCount, String secCommand) {
        List<Integer> firstResult = new ArrayList<>();
        int counter = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0 &&  secCommand.equals("even")) {
                firstResult.add(currentNumber);
                counter++;
            } else if (currentNumber % 2 != 0 &&  secCommand.equals("odd")) {
                firstResult.add(currentNumber);
                counter++;
            }

            if (counter == firstCount) {
                break;
            }
        }
        return firstResult;
    }

    private static void exchangeElements(int[] numbers, int index) {
        for (int i = 0; i <= index; i++) {
            int firstElement = numbers[0];
            for (int j = 1; j < numbers.length; j++) {
                numbers[j - 1] = numbers[j];
            }
            numbers[numbers.length - 1] = firstElement;
        }
    }

    private static int getBestMaxIndex(int[] numbers, String evenOrOdd) {
        int maxElement = Integer.MIN_VALUE;
        int bestMaxIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0 && evenOrOdd.equals("even") && currentNumber >= maxElement) {
                 maxElement = currentNumber;
                 bestMaxIndex = i;
            } else if (currentNumber % 2 != 0 && evenOrOdd.equals("odd") && currentNumber >= maxElement) {
                maxElement = currentNumber;
                bestMaxIndex = i;
            }
        }
        return bestMaxIndex;
    }

    private static int getBestMinIndex(int[] numbers, String secondCommand) {
        int minElement = Integer.MAX_VALUE;
        int bestMinIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0 && secondCommand.equals("even") && currentNumber <= minElement) {
                minElement = currentNumber;
                bestMinIndex = i;
            } else if (currentNumber % 2 != 0 && secondCommand.equals("odd") && currentNumber <= minElement) {
                minElement = currentNumber;
                bestMinIndex = i;
            }
        }
        return bestMinIndex;
    }

    private static void bestIndexPrinting(int bestMinIndex) {
        if (bestMinIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(bestMinIndex);
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
