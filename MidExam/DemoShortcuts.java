package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoShortcuts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

       while (!input.equals("")) {
           List<String> list = Arrays.stream(input.split(" ")).collect(Collectors.toList());
           input = scanner.nextLine();
       }





    }
}
