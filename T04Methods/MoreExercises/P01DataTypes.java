package T04Methods.MoreExercises;
import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();
        String data = scanner.nextLine();

        // 2. Output printing 3 cases:
        if (dataType.equals("real")) {
            double result1 = Double.parseDouble(data) * 1.5;
            System.out.printf("%.2f", result1);
        } else if (dataType.equals("int")) {
            int result2 = Integer.parseInt(data) * 2;
            System.out.println(result2);
        } else {
            String result3 = "$" + data + "$";
            System.out.println(result3);
        }
    }
}
