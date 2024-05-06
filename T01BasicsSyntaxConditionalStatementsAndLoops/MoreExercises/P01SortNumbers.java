package T01BasicsSyntaxConditionalStatementsAndLoops.MoreExercises;
import java.util.*;

public class P01SortNumbers {
    public static void main(String[] args) {
        // 1. Numbers reading and adding numbers into set
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            list.add(currentNumber);
        }

        // 2. Sorting
        list.sort(Comparator.reverseOrder());

        // 3. Output printing
        list.forEach(System.out::println);
    }
}

