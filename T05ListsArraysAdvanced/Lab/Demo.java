package T05ListsArraysAdvanced.Lab;


import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> command = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

       command.remove(Integer.valueOf(1));

        System.out.println(command.toString().replaceAll("[\\[\\],]", ""));

    }
}
