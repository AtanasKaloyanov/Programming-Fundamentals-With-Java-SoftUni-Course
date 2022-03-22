package T03Arrays.Lists.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09SecondSolution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int longDNK = Integer.parseInt(console.nextLine());
        String cloneDNK = console.nextLine();
        int numberCombination = 0;
        int bestSequence = 1;
        int bestSum = 0;
        int[] bestCombination = new int[longDNK];
        int bestLongest = 0;
        int bestSequenceIndex = 0;

        while (!"Clone them!".equals(cloneDNK)) {
            numberCombination++;
            int longestSequenceOne = 0;
            int longestSequenceTwo = 0;
            int sequenceIndexStart = 0;
            int sequenceIndexTemp = 0;
            int sum = 0;
            int[] oneZero = Arrays.stream(cloneDNK.split("!+")).mapToInt(Integer::parseInt).toArray();

            if (oneZero[0] == 1) {
                longestSequenceOne++;
                sum++;
            }
            for (int i = 1; i < longDNK; i++) {
                if (oneZero[i] == 1) sum++;
                if (oneZero[i - 1] == oneZero[i] && oneZero[i] == 1) {
                    longestSequenceOne++;

                    if (longestSequenceOne > longestSequenceTwo) {
                        sequenceIndexTemp = sequenceIndexStart;
                        longestSequenceTwo = longestSequenceOne;
                    }
                } else if (oneZero[i - 1] == 0 && oneZero[i] == 1) {
                    longestSequenceOne = 1;
                    sequenceIndexStart = i;
                }

            }
            if (longestSequenceTwo > bestLongest
                    || (longestSequenceTwo == bestLongest && sequenceIndexTemp < bestSequenceIndex)
                    || (longestSequenceTwo == bestLongest && sequenceIndexTemp == bestSequenceIndex && sum > bestSum)) {
                bestLongest = longestSequenceTwo;
                bestSequence = numberCombination;
                bestSum = sum;
                bestCombination = oneZero;
                bestSequenceIndex = sequenceIndexTemp;
            }

            cloneDNK = console.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequence, bestSum);
        for (int number : bestCombination) {
            System.out.printf("%d ", number);
        }
    }
}
