package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

public class P08DivisibleBy3 {
    // 1. Output printing via for cycle
    public static void main(String[] args) {
        for (int i = 3; i <= 99; i += 3) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
