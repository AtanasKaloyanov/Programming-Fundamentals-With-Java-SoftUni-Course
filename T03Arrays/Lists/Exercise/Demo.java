package T03Arrays.Lists.Exercise;


import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfTheSequence = Integer.parseInt(scanner.nextLine());
        int[] bestDNA = new int[lengthOfTheSequence];

        String input = scanner.nextLine();

        int bestOnes = 1;
        int bestSum = 0;
        int bestSample = 0;
        int bestIndex = 0;

        int currentSample = 0;

        while (!input.equals("Clone them!")) {

            int[] DNA = Arrays
                    .stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            currentSample++;

            int maxCurrentsOnes = 1;
            int currentLength = 1;
            int currentSum = 0;
            int currentIndex = 0;

            for (int i = 0; i < DNA.length - 1; i++) {

                if (DNA[i] == DNA[i + 1]) {
                    currentLength++;
                } else {
                    currentLength = 1;
                }
                if (currentLength > maxCurrentsOnes) {
                    maxCurrentsOnes = currentLength;
                    currentIndex = i;

                }
                currentSum = currentSum + DNA[i];
            }
            currentSum = currentSum + DNA[DNA.length - 1];

            if (maxCurrentsOnes > bestOnes) {
                bestOnes = maxCurrentsOnes;
                bestIndex = currentIndex;
                bestSum = currentSum;
                bestSample = currentSample;
                bestDNA = DNA;
            } else if (maxCurrentsOnes == bestOnes) {
                if (currentIndex < bestIndex) {
                    bestIndex = currentIndex;
                    bestSum = currentSum;
                    bestSample = currentSample;
                    bestDNA = DNA;

                } else if (currentIndex == bestIndex) {
                    if (currentSum > bestSum) {
                        bestSum = currentSum;
                        bestSample = currentSample;
                        bestDNA = DNA;
                    }
                }
            }

            input = scanner.nextLine();

        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, bestSum);

        for (int i = 0; i <= bestDNA.length - 1 ; i++) {
            System.out.print(bestDNA[i] + " ");
        }

    }
}
