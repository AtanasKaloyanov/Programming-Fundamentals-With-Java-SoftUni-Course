package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Complete")) {
            String[] array = input.split(" ");
            String command = array[0];

            switch (command) {

                case "Make":
                    String secondCommand = array[1];

                    if (secondCommand.equals("Upper")) {
                        int index = Integer.parseInt(array[2]);
                        char example = sb.charAt(index);

                        if (Character.isLetter(example)) {
                            char newChar = Character.toUpperCase(sb.charAt(index));
                            sb.setCharAt(index, (newChar));

                            System.out.println(sb);
                        }

                    } else if (secondCommand.equals("Lower")) {
                        int index = Integer.parseInt(array[2]);
                        char secondExample = sb.charAt(index);

                        if (Character.isLetter(secondExample)) {
                            char newChar = Character.toLowerCase(sb.charAt(index));
                            sb.setCharAt(index, (newChar));

                            System.out.println(sb);
                        }
                    }

                    break;

                case "Insert":
                    int index = Integer.parseInt(array[1]);

                    if (index >= 0 && index <= sb.length()) {
                        char currentChar = array[2].charAt(0);

                        sb.insert(index, currentChar);
                        System.out.println(sb);
                    }
                    break;

                case "Replace":
                    char currentChar2 = (array[1].charAt(0));
                    int value = Integer.parseInt(array[2]);

                    int charValue = currentChar2;

                    int sum = charValue + value;

                    char newChar = (char) sum;

                    String oldString = currentChar2 + "";
                    String newString = newChar + "";

                    if (sb.toString().contains(oldString)) {

                        sb.replace(0, sb.length(), sb.toString().replace(oldString, newString));

                        System.out.println(sb);
                    }

                    break;

                case "Validation":
                    int counter = 0;

                    for (int i = 0; i <= sb.length(); i++) {

                        counter++;
                    }

                    if (counter < 8) {
                        System.out.println("Password must be at least 8 characters long!");
                    }

                    Pattern pattern = Pattern.compile("[A-Za-z0-9_]");
                    Matcher matcher = pattern.matcher(sb.toString());

                    int counter2 = 0;
                    while (matcher.find()) {
                        counter2++;
                    }

                    if (counter2 == 0) {
                        System.out.println("Password must consist only of letters, digits and _!");
                    }

                    Pattern pattern2 = Pattern.compile("[A-Z]");
                    Matcher matcher2 = pattern2.matcher(sb.toString());

                    int counter3 = 0;
                    while (matcher2.find()) {
                        counter3++;
                    }
                    if
                    (counter3 == 0) {
                        System.out.println("Password must consist at least one uppercase letter!");
                    }


                    Pattern pattern3 = Pattern.compile("[a-z]");
                    Matcher matcher3 = pattern3.matcher(sb.toString());

                    int conter4 = 0;
                    while (matcher3.find()) {
                        conter4++;
                    }
                    if (conter4 == 0) {
                        System.out.println("Password must consist at least one lowercase letter!");
                    }
                    Pattern pattern4 = Pattern.compile("[0-9]");
                    Matcher matcher4 = pattern4.matcher(sb.toString());

                    int counter5 = 0;
                    while (matcher4.find()) {
                        counter5++;
                    }
                    if (counter5 == 0) {
                        System.out.println("Password must consist at least one digit!");
                    }
                    break;


            }
            input = scanner.nextLine();
        }

    }
}
