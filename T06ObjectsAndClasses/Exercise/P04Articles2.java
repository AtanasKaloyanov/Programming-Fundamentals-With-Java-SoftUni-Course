package T06ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class P04Articles2 {
    public static class Articles {
        String title;
        String content;
        String author;

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return this.title;
        }

        public Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            String[] currentArray = scanner.nextLine().split(", ");

            String title = currentArray[0];
            String content = currentArray[1];
            String author = currentArray[2];

            Articles articles = new Articles(title, content, author);

            System.out.println(articles.toString());
        }

        String command = scanner.nextLine();


    }
}
