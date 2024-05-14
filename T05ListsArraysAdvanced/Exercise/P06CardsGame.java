package T05ListsArraysAdvanced.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> cards1 = readCards(scanner);
        Queue<Integer> cards2 = readCards(scanner);

        // 2. While cycle until some of the list becomes empty
        while (cards1.size() > 0 && cards2.size() > 0) {
            int card1 = cards1.poll();
            int card2 = cards2.poll();

            if (card1 > card2) {
                cards1.add(card1);
                cards1.add(card2);
            } else if (card2 > card1) {
                cards2.add(card2);
                cards2.add(card1);
            }
        }

        // 3. 2 variables assignment and output printing
        int winnerSum;
        String winner;
        if (cards1.size() == 0) {
            winnerSum = cards2.stream().mapToInt( (element) -> element).sum();
            winner = "Second";
        } else {
            winnerSum = cards1.stream().mapToInt( (element) -> element).sum();
            winner = "First";
        }

        System.out.printf("%s player wins! Sum: %d", winner, winnerSum);
    }

    private static ArrayDeque<Integer> readCards(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
    }
}
