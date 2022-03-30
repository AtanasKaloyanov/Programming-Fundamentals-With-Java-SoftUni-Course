package FinalExamPreparation.E03FinalExamRetake10April2020;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {

            String[] information = input.split(":\\|:");
            String command = information[0];

            switch (command) {
                case "InsertSpace":

                    int index = Integer.parseInt(information[1]);
                    sb.insert(index, " ");

                    System.out.println(sb);

                    break;

                case "Reverse":

                    String givenString = information[1];

                    if (sb.toString().contains(givenString)) {

                        int firstIndex = sb.indexOf(givenString);
                        sb.delete(firstIndex, givenString.length() + firstIndex);

                        StringBuilder reversedSb = new StringBuilder(givenString).reverse();
                        sb.append(reversedSb);

                        System.out.println(sb);

                    } else {
                        System.out.println("error");
                    }

                    break;

                case "ChangeAll":

                    String oldString = information[1];
                    String newsString = information[2];

                    sb.replace(0, sb.length(), sb.toString().replace(oldString, newsString));

                    System.out.println(sb);

                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", sb);

        //On the first line of the input, you will receive the concealed message. After that, until the "Reveal" command is given, you will receive strings with instructions for different operations that need to be performed upon the concealed message to interpret it and reveal its actual content. There are several types of instructions, split by ":|:"
        //•	"InsertSpace:|:{index}":
        //o	Inserts a single space at the given index. The given index will always be valid.
        //•	"Reverse:|:{substring}":
        //o	If the message contains the given substring, cut it out, reverse it and add it at the end of the message.
        //o	If not, print "error".
        //o	This operation should replace only the first occurrence of the given substring if there are two or more occurrences.
        //•	"ChangeAll:|:{substring}:|:{replacement}":
        //o	Changes all occurrences of the given substring with the replacement text.
        //Input / Constraints
        //•	On the first line, you will receive a string with a message.
        //•	On the following lines, you will be receiving commands, split by ":|:".
        //Output
        //•	After each set of instructions, print the resulting string.
        //•	After the "Reveal" command is received, print this message:
        //"You have a new text message: {message}"


    }
}
