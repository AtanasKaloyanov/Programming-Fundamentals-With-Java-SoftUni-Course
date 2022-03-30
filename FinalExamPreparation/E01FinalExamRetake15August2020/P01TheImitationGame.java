package ExamPreparation.E01FinalExamRetake15August2020;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] information = input.split("\\|");
            String command = information[0];

            switch (command) {
                case "Move":
                    int numberLetters = Integer.parseInt(information[1]);

                    String string = sb.substring(0, numberLetters);
                    sb.delete(0, numberLetters);
                    sb.append(string);

                    break;

                case "Insert":

                    int index = Integer.parseInt(information[1]);
                    String value = information[2];

                    sb.insert(index, value);

                    break;
                case "ChangeAll":

                    String occurence = information[1];
                    String replacement = information[2];

                    sb.replace(0, sb.length(), sb.toString().replace(occurence, replacement));

                    //                       zzHe
                    // ChangeAll|z|l         llHe
            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", sb);


//                      zzHe
//ChangeAll|z|l         llHe
//Insert|2|o            lloHe
//Move|3                Hello
    }
}
