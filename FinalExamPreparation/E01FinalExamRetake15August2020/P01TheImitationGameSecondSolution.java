package ExamPreparation.E01FinalExamRetake15August2020;

import java.util.Scanner;

public class P01TheImitationGameSecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] information = input.split("\\|");
            String command = information[0];

            switch (command) {

                case "Move":
                    int numberOfLetters = Integer.parseInt(information[1]);
                    String substring = string.substring(0, numberOfLetters);
                    string = string.replace(substring, "");
                    string = string + substring;

                    //3 letters ->   llo  He → He  llo

                    break;

                case "Insert":
                    int index = Integer.parseInt(information[1]);
                    String value = information[2];

                    String firstString = string.substring(0, index);
                    String secondString = string.substring(index);

                    string = firstString + value + secondString;

                    // zzHe  -  2\o  -    zzoHe

                    break;

                case "ChangeAll":

                 String substring2 = information[1];
                 String replacement = information[2];
                 string = string.replaceAll(substring2, replacement);

                 break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", string);

    }
}

//zzHe
//zzHe              ChangeAll|z|l      llHe
//llHe              Insert|2|o         lloHe
//lloHe             Move|3             Hello
//Hello