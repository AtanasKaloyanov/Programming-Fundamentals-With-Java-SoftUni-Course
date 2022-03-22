package T09RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[abc]");
        Matcher matcher = pattern.matcher("a b c");

        String result = matcher.replaceFirst("hi");

        System.out.println(result);

        
    }
}
