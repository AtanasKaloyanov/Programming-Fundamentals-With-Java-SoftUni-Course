package T06ObjectsAndClasses.Lab;
import java.util.*;

public class P04Songs {
    static class Song {
        private String type;
        private String name;
        private String time;

        public Song(String type, String name, String time) {
            this.type = type;
            this.name = name;
            this.time = time;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Songs reading
        // String type   Song
        Map<String, List<Song>> songsByTpe = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] array = scanner.nextLine().split("_");
            String type = array[0];
            String name = array[1];
            String time = array[2];

            Song song = new Song(type, name, time);
            songsByTpe.putIfAbsent(type, new ArrayList<>());
            songsByTpe.get(type).add(song);
        }

        // 3. Command reading and output printing
        String command = scanner.nextLine();
        if (command.equals("all")) {
            songsByTpe.forEach((key, currentSongList) -> currentSongList.forEach(System.out::println));
        } else {
            List<Song> searchedSongs = songsByTpe.get(command);
            searchedSongs.forEach(System.out::println);
        }
    }

}
