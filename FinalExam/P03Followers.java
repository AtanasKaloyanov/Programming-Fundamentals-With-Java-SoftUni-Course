package FinalExam;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;


public class P03Followers {
    public static class User {

        int likes;
        int comments;

        public User(int likes, int comments) {
            this.likes = likes;
            this.comments = comments;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, User> users = new LinkedHashMap();

        String line = scanner.nextLine();

        int currentLikes = 0;
        int currentComments = 0;

        while (!line.equals("Log out")) {

            String[] input = line.split(": ");
            String currentName = input[1];
            User user = new User(currentLikes, currentComments);

            switch (input[0]) {

                case "New follower":
                    users.putIfAbsent(currentName, user);
                    break;

                case "Like":
                    if (users.containsKey(currentName)) {
                        int likes = users.get(currentName).getLikes();
                        int anotherLikes = Integer.parseInt(input[2]);
                        users.get(currentName).setLikes(likes + anotherLikes);

                    } else {
                        users.putIfAbsent(currentName, user);
                        user.setLikes(Integer.parseInt(input[2]));
                    }
                    break;

                case "Comment":
                    if (users.containsKey(currentName)) {
                        int comments = users.get(currentName).getComments();
                        int anotherComments = 1;
                        users.get(currentName).setComments(comments + anotherComments );

                    } else {
                        users.putIfAbsent(currentName, user);
                        user.setComments(1);
                    }
                    break;

                case "Blocked":

                    if (users.containsKey(currentName)) {
                        users.remove(currentName);
                    } else {
                        System.out.println(currentName + " doesn't exist.");
                    }

                    break;
            }

            line = scanner.nextLine();
        }
        System.out.printf("%d followers %n", users.size());
        users.forEach((key, value) -> {
            System.out.printf("%s: ", key);
            System.out.printf("%d%n", users.get(key).getComments() + users.get(key).getLikes());
        });
    }
}
