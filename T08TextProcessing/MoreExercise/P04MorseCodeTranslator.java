package T08TextProcessing.MoreExercise;

import java.util.Scanner;

public class P04MorseCodeTranslator {
    private static final String A = ".-";
    private static final String B = "-...";
    private static final String C = "-.-.";
    private static final String D = "-..";
    private static final String E = ".";
    private static final String F = "..-.";
    private static final String G = "--.";
    private static final String H = "....";
    private static final String I = "..";
    private static final String J = ".---";
    private static final String K = "-.-";
    private static final String L = ".-..";
    private static final String M = "--";
    private static final String N = "-.";
    private static final String O = "---";
    private static final String P = ".--.";
    private static final String Q = "--.-";
    private static final String R = ".-.";
    private static final String S = "...";
    private static final String T = "-";
    private static final String U = "..-";
    private static final String V = "...-";
    private static final String W = ".--";
    private static final String X = "-..-";
    private static final String Y = "-.--";
    private static final String Z = "--..";

    public static void main(String[] args) {
          // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");

        // 2.
        for (String word : words) {
            switch (word) {
                case "|":
                    result.append(" ");
                    break;
                case A:
                    result.append("A");
                    break;
                case B:
                    result.append("B");
                    break;
                case C:
                    result.append("C");
                    break;
                case D:
                    result.append("D");
                    break;
                case E:
                    result.append("E");
                    break;
                case F:
                    result.append("F");
                    break;
                case G:
                    result.append("G");
                    break;
                case H:
                    result.append("H");
                    break;
                case I:
                    result.append("I");
                    break;
                case J:
                    result.append("J");
                    break;
                case K:
                    result.append("K");
                    break;
                case L:
                    result.append("L");
                    break;
                case M:
                    result.append("M");
                    break;
                case N:
                    result.append("N");
                    break;
                case O:
                    result.append("O");
                    break;
                case P:
                    result.append("P");
                    break;
                case Q:
                    result.append("Q");
                    break;
                case R:
                    result.append("R");
                    break;
                case S:
                    result.append("S");
                    break;
                case T:
                    result.append("T");
                    break;
                case U:
                    result.append("U");
                    break;
                case V:
                    result.append("V");
                    break;
                case W:
                    result.append("W");
                    break;
                case X:
                    result.append("X");
                    break;
                case Y:
                    result.append("Y");
                    break;
                case Z:
                    result.append("Z");
                    break;
            }
        }

        // 2.
        System.out.println(result);
    }
}
