package T06ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P02Articles {

    public static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
           return String.format("%s - %s: %s", this.title, this.content, this.author);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int numberCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberCommands; i++) {

            String[] currentArray = scanner.nextLine().split(": ");

            String command = currentArray[0];
            String newInformation = currentArray[1];

            switch (command) {
                case "Edit":
                    article.setContent(newInformation);
                    break;

                case "ChangeAuthor":
                    article.setAuthor(newInformation);
                    break;

                case "Rename":
                    article.setTitle(newInformation);
                    break;
            }
        }

        System.out.println(article.toString());

    }
}
