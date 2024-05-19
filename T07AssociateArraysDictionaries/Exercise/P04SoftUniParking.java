package T07AssociateArraysDictionaries.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. 2 commands implementation via map
        Map<String, String> plateNumbersByUsers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split(" ");
            String command = currentArray[0];
            String user = currentArray[1];

            switch (command) {
                case "register":
                    if (plateNumbersByUsers.containsKey(user)) {
                        String existentPlateNumber = plateNumbersByUsers.get(user);
                        System.out.printf("ERROR: already registered with plate number %s\n", existentPlateNumber);
                    } else {
                        String plateNumber = currentArray[2];
                        plateNumbersByUsers.put(user, plateNumber);
                        System.out.printf("%s registered %s successfully\n", user, plateNumber);
                    }
                    break;
                case "unregister":
                    String removedUser = plateNumbersByUsers.remove(user);
                    if (removedUser == null) {
                        System.out.printf("ERROR: user %s not found\n", user);
                    } else {
                        System.out.printf("%s unregistered successfully\n", user);
                    }
                    break;
            }
        }

        // 3. Output printing:
        plateNumbersByUsers.forEach( (key, value) -> System.out.printf("%s => %s\n", key, value));
    }
}


