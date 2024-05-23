package T08TextProcessing.MoreExercise;

import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String title = scanner.nextLine();
        String content = scanner.nextLine();
        sb.append("<h1>").append("\n").append("\t").append(title).append("\n").append("</h1>").append("\n");
        sb.append("<article>").append("\n").append("\t").append(content).append("\n").append("</article>").append("\n");

        // 2. Adding comments to the StringBuilder
        String currentComment = scanner.nextLine();
        while (!currentComment.equals("end of comments")) {
            sb.append("<div>").append("\n").append("\t").append(currentComment).append("\n").append("</div>").append("\n");
            currentComment = scanner.nextLine();
        }

        // 3. Output printing
        System.out.println(sb);
    }
}
