package T05ListsArraysAdvanced.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mergingNumbers = new ArrayList<>();
        for (int i = 0; i < Math.min(firstNumbers.size(), secondNumbers.size()); i++) {

            mergingNumbers.add(firstNumbers.get(i));
            mergingNumbers.add(secondNumbers.get(i));

        }
        if (firstNumbers.size() > secondNumbers.size()) {
             addingTheRemainingElements(secondNumbers, firstNumbers, mergingNumbers);
        } else if (secondNumbers.size() > firstNumbers.size()) {
            addingTheRemainingElements(firstNumbers, secondNumbers, mergingNumbers);
        }

        for (int number : mergingNumbers) {
            System.out.print(number + " ");
        }

    }
    public static List <Integer> addingTheRemainingElements(List <Integer> shorterList, List <Integer> longerList, List <Integer> mergingList ) {

        for (int i = shorterList.size(); i < longerList.size(); i++) {
            mergingList.add(longerList.get(i));
        }
        return mergingList;
    }


    }

