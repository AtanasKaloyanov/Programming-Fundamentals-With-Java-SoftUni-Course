package T06ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs { static class Song {
    String typeList;
    String name;
    String time;

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getTypeList() {
        return this.typeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 1; i <= numberSongs ; i++) {

            String[] information = scanner.nextLine().split("_");
            String type = information[0];
            String name = information[1];
            String time = information[2];

            Song currentSong = new Song();

            currentSong.setTypeList(type);
            currentSong.setName(name);
            currentSong.setTime(time);

            songList.add(currentSong);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song item : songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songList) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }

    }
}
