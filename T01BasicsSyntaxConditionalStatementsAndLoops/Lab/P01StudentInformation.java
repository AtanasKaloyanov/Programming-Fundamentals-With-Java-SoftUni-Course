package T01BasicsSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

    }
}
 //You will be given 3 input lines:
//Student Name, Age and Average Grade
//Print the input in the following format:
//"Name: {name}, Age: {age}, Grade {grade}"
//Format the grade to 2 decimal places