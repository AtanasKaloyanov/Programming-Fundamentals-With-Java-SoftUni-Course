package T09RegularExpressions.MoreExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03PostOffice {
    private static String lettersRegex = "([\\#\\$\\%\\*\\&])(?<letters>[A-Z]+)(\\1)";
    private static String codeAndLengthRegex = "(?<ASCII>\\d{2}):(?<length>\\d{2})";
    private static String wordsRegex = "\\bX[A-Za-z]{X}\\b";

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Working with regexes
        String[] array = input.split("\\|");
        String part1 = array[0];

        // 2.1. Finding the letters
        Pattern lettersPattern = Pattern.compile(lettersRegex);
        Matcher lettersMatcher = lettersPattern.matcher(part1);
        boolean ifMatch = lettersMatcher.find();
        String lettersMatch = lettersMatcher.group("letters");

        // 2.2. - Adding the lengths by chars in a map
        Map<Character, Integer> lengthsByCharacters = new HashMap<>();

        String part2 = array[1];
        Pattern codeAndLengthPattern = Pattern.compile(codeAndLengthRegex);
        Matcher codeAndLengthMatcher = codeAndLengthPattern.matcher(part2);

        while (codeAndLengthMatcher.find()) {
            String currentCode = codeAndLengthMatcher.group("ASCII");
            char currentLetter = (char) Integer.parseInt(currentCode);
            String currentLength = codeAndLengthMatcher.group("length");
            int length = Integer.parseInt(currentLength);
            lengthsByCharacters.put(currentLetter, length);
        }

        // 2.3. Finding and printing the words
        String part3 = array[2];
        part3 = " " + part3 + " ";
        for (int i = 0; i < lettersMatch.length(); i++) {
            char currentChar = lettersMatch.charAt(i);
            if (lengthsByCharacters.containsKey(currentChar)) {
                int currentLength = lengthsByCharacters.get(currentChar);
                String wordRegex = " " + currentChar + "[^ ]{" + currentLength + "} ";
                Pattern wordPattern = Pattern.compile(wordRegex);
                Matcher wordMatcher = wordPattern.matcher(part3);
                while (wordMatcher.find()) {
                    String match = wordMatcher.group();
                    System.out.println(match.replace(" ", ""));
                }
            }
        }
    }
}
