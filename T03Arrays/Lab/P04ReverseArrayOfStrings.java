package T03Arrays.Lists.Lab;
import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        // 2. Reversing the array via half for cycle
        int end = array.length / 2;
        int index = array.length - 1;
        for (int i = 0; i < end; i++) {
            String temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            index--;
        }

        // 3. Output printing
        System.out.println(String.join(" ", array));
    }
}
