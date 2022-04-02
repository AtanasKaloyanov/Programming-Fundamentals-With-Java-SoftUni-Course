package T08TextProcessing.Lab;

import java.util.Scanner;

public class P03SubstringsSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String example = scanner.nextLine();
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        sb.replace(0, sb.length(), sb.toString().replace(example, ""));
        System.out.println(sb);
    }
}
