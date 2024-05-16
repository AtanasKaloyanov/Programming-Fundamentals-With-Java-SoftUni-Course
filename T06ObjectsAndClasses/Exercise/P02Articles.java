package T06ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class P02Articles {

    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public void rename(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());

        String title = info[0];
        String content = info[1];
        String author = info[2];
        Article article = new Article(title, content, author);

        // 2. Command implementation
        for (int i = 0; i < n; i++) {
            String currentInfo = scanner.nextLine();
            String[] currentArray = currentInfo.split(": ");
            String newInfo = currentArray[1];
            if (currentInfo.startsWith("Edit")) {
                article.edit(newInfo);
            } else if (currentInfo.startsWith("ChangeAuthor")) {
                article.changeAuthor(newInfo);
            } else if (currentInfo.startsWith("Rename")) {
                article.rename(newInfo);
            }
        }

        // 3. Output printing
        System.out.println(article);
    }
}
