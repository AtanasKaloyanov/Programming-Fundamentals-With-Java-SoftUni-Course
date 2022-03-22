package T02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());

        int equalN = N;

        int targets = 0;

        // N = PokePower
        // M = distance
        // Y = exhaustionFactor

        while (N >= M) {


            if (N == 0.5 * equalN && Y != 0) {

                N = N / Y;
                if (N < M) {
                    break;
                }

            }
            N = N - M;
            targets++;

        }
        System.out.println(N);
        System.out.println(targets);
    }
}
