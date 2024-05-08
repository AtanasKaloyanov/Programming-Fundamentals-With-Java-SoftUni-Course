package T03Arrays.Lists.Exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will be given a count of wagons in a train n. On the next n lines,
        // you will receive how many people are going to get on that wagon.
        // At the end print the whole train and after that the sum of the people on the train.

        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= count ; i++) {
            int travellers = Integer.parseInt(scanner.nextLine());
            sum += travellers;
            System.out.print(travellers + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
