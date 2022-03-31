package FinalExamPreparation.E01FinalExamRetake15August2020;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    public static class Music {
        String piece;
        String composer;
        String key;

        public String getPiece() {
            return piece;
        }

        public void setPiece(String piece) {
            this.piece = piece;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getComposer() {
            return composer;
        }

        public String getKey() {
            return key;
        }

        public Music(String piece, String composer, String key) {
            this.piece = piece;
            this.composer = composer;
            this.key = key;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Music> map = new LinkedHashMap<>();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            String[] data = scanner.nextLine().split("\\|");

            String pieceName = data[0];
            String composer = data[1];
            String key = data[2];

            map.put(pieceName, new Music(pieceName, composer, key));
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] data = input.split("\\|");
            String command = data[0];

            switch (command) {

                case "Add":

                    String piece = data[1];
                    String composer = data[2];
                    String key = data[3];

                    if (!map.containsKey(piece)) {
                        map.put(piece, new Music(piece, composer, key));
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);

                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }

                    break;

                case "Remove":

                    String piece2 = data[1];

                    if (map.containsKey(piece2)) {
                        map.remove(piece2);
                        System.out.printf("Successfully removed %s!%n", piece2);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece2);
                    }

                    break;

                case "ChangeKey":
                    String piece3 = data[1];
                    String newKey = data[2];

                    if (map.containsKey(piece3)) {
                        map.get(piece3).setKey(newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece3, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece3);
                    }

                    break;


            }

            input = scanner.nextLine();
        }
//"{Piece} -> Composer: {composer}, Key: {key}"
        map.entrySet().forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().getComposer(), entry.getValue().getKey()));
    }
}
