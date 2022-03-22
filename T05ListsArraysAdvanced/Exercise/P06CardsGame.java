package T05ListsArraysAdvanced.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerCards.size() != 0 && secondPlayerCards.size() != 0) {

           int firstCardOfTheFirstPlayer =  firstPlayerCards.get(0) ;
           int firstCardOfTheSecondPlayer =  secondPlayerCards.get(0) ;

           if (firstCardOfTheFirstPlayer > firstCardOfTheSecondPlayer) {

               firstPlayerCards.add(firstPlayerCards.size(), firstCardOfTheFirstPlayer);
               firstPlayerCards.remove(0);
               firstPlayerCards.add(firstPlayerCards.size(), firstCardOfTheSecondPlayer);
               secondPlayerCards.remove(0);


           } else if (firstCardOfTheFirstPlayer < firstCardOfTheSecondPlayer) {

               secondPlayerCards.add(secondPlayerCards.size(), firstCardOfTheSecondPlayer);
               secondPlayerCards.remove(0);
               secondPlayerCards.add(secondPlayerCards.size(), firstCardOfTheFirstPlayer);
               firstPlayerCards.remove(0);

           } else  {
               firstPlayerCards.remove(0);
               secondPlayerCards.remove(0);
           }
        }
        if (firstPlayerCards.size() == 0) {
           int sum = 0;
            for (int card : secondPlayerCards) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            int sum = 0;
            for (int card : firstPlayerCards) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
