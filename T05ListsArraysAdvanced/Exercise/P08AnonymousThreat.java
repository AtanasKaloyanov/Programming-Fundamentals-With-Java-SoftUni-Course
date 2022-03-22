package T05ListsArraysAdvanced.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {

            List<String> currentlist = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

            String command = currentlist.get(0);

            switch (command) {

                case "merge":

                    int givenStartIndex = Integer.parseInt(currentlist.get(1));
                    int givenEndIndex = Integer.parseInt(currentlist.get(2));

                    if ((givenStartIndex < 0 && givenEndIndex < 0) || ((givenStartIndex > list.size() - 1 && givenEndIndex > list.size() - 1))) {
                        break;
                    }

                    int startIndex = Math.max(0, givenStartIndex);
                    int endIndex = Math.min(list.size() - 1, givenEndIndex);

                    StringBuilder concatElements = new StringBuilder();

                    for (int i = startIndex; i <= endIndex; i++) {
                        concatElements.append(list.get(i));
                        
                    }
                    for (int i = endIndex; i >= startIndex ; i--) {
                        list.remove(i);
                    }

                    list.add(startIndex, concatElements.toString());

                    break;

                    // abcd efgh ijkl mnop qrst uvwx yz
                // Горният вход трябва да се превърне в написаното долу след подаден лист merge 4 10
                    // abcd efgh ijkl mnop qrstuvwxyz

                case "divide":

                    int index = Integer.parseInt(currentlist.get(1));
                    int parts = Integer.parseInt(currentlist.get(2));

                    String dividedString = list.get(index);
                    int chars = dividedString.length() / parts;

                    list.remove(index);
                    int begin = 0;

                    for (int i = 1; i < parts; i++) {
                        String newString = dividedString.substring(begin, begin + chars);
                        list.add(index, newString);
                        index++;
                        begin = begin + chars;
                    }
                    String lastString = dividedString.substring(begin);
                    list.add(index, lastString);

                    break;

               // abcd efgh ijkl mnop qrstuvwxyz
                // След команда devide 4 5
                // abcd efgh ijkl mnop qr st uv wx yz
            }
            input = scanner.nextLine();
        }

        for (String currentElement : list) {

            System.out.print(currentElement + " ");

        }

    }
}

