package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int number = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 1;

        while (counter <= number) {

            List<String> list = Arrays.stream(input.split(", ")).collect(Collectors.toList());
            String command = list.get(0);

            switch (command) {
                case "Add":
                    String currentCard = list.get(1);
                    boolean doesExist = cards.contains(currentCard);

                    if (!doesExist) {
                        cards.add(cards.size(), currentCard);
                        System.out.println("Card successfully added");

                    } else {
                        System.out.println("Card is already in the deck");
                    }
                    break;

                case "Remove":

                    String currentCard2 = list.get(1);
                    boolean doesExist2 = cards.contains(currentCard2);


                    if (doesExist2) {

                        cards.remove(currentCard2);
                        System.out.println("Card successfully removed");

                    } else {
                        System.out.println("Card not found");
                    }

                    break;

                case "Remove At":

                    int Index = Integer.parseInt(list.get(1));

                    if (Index >= 0 && Index <= cards.size() - 1) {
                        cards.remove(Index);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }

                    break;

                case "Insert":
                    int givenIndex = Integer.parseInt(list.get(1));
                    String cardName = list.get(2);
                    boolean doesExist3 = cards.contains(cardName);

                    if (givenIndex >= 0 && givenIndex < cards.size() - 1) {
                        if (!doesExist3) {
                            cards.add(givenIndex, cardName);
                            System.out.println("Card successfully added");
                        } else {
                            System.out.println("Card is already added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }

            counter++;

            if (counter <= number) {
                input = scanner.nextLine();
            }
        }
            System.out.println(cards.toString().replaceAll("[\\[\\]]", " ").trim());

    }
}
