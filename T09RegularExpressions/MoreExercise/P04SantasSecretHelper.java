package T09RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantasSecretHelper {
    private static final String regex = "@(?<name>[A-Za-z]+)([^\\-@!:>])*?!(?<behavior>G|N)!";

    public static void main(String[] args) {
      // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());

        //  2. Finding and printing matchs
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                currentChar -= key;
                sb.append(currentChar);
            }

            Matcher matcher = pattern.matcher(sb);
            while (matcher.find()) {
                String behaviour = matcher.group("behavior");
                if (behaviour.equals("G")) {
                    String name = matcher.group("name");
                    System.out.println(name);
                }
            }

            input = scanner.nextLine();
        }
    }
}

/*
3
CNdwhamigyenumje$J$
CEreelh-nmguuejn$J$
CVwdq&gnmjkvng$Q$
end

Kate
Bobbie
 */

/*
3
N}eideidmk$'(mnyenmCNlpamnin$J$
ddddkkkkmvkvmCFrqqru-nvevek$J$nmgievnge
ppqmkkkmnolmnnCEhq/vkievk$Q$
yyegiivoguCYdohqwlqh/kguimhk$J$
end

Kim
Connor
Valentine
 */