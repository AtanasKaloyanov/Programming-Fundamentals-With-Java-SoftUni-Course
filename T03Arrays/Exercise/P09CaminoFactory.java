package T03Arrays.Lists.Exercise;


import java.util.Arrays;
import java.util.Scanner;

public class P09CaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenNumber = Integer.parseInt(scanner.nextLine());
        int[] bestDNA = new int[givenNumber];

        String input = scanner.nextLine();

        int currentSample = 0;

        int bestSequence = 1;
        int bestSum = 0;
        int bestIndex = 0;
        int bestSample = 0;

        while (!input.equals("Clone them!")) {

            int[] DNA = Arrays
                    .stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            currentSample++;

            int currentOnes = 1;
            int maxOnes = 1;
            int currentIndex = 0;
            int currentSum = 0;

            for (int i = 0; i < DNA.length - 1; i++) {

                if (DNA[i] == DNA[i + 1]) {
                    currentOnes++;
                } else {
                    currentOnes = 1;
                }

                if (currentOnes > maxOnes) {
                    maxOnes = currentOnes;
                    currentIndex = i;
                }

                currentSum = currentSum + DNA[i];
            }
            currentSum = currentSum + DNA[DNA.length - 1];

            if (maxOnes > bestSequence) {
                bestSequence = maxOnes;
                bestIndex = currentIndex;
                bestSum = currentSum;
                bestSample = currentSample;
                bestDNA = DNA;

            } else if (maxOnes == bestSequence) {
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

        for (int i = 0; i <= bestDNA.length - 1; i++) {
            System.out.print(bestDNA[i] + " ");
        }

    }
}
