package T07AssociateArraysDictionaries.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandNumbers = Integer.parseInt(scanner.nextLine());
        Map<String, String> ownerAndCarsMap = new LinkedHashMap<>();

        for (int i = 1; i <= commandNumbers ; i++) {
            String[] currentData = scanner.nextLine().split(" ");
            String command = currentData[0];

            if (command.equals("register")) {
                String user = currentData[1];
                String carNumber = currentData[2];

                if (!ownerAndCarsMap.containsKey(user)) {
                    ownerAndCarsMap.put(user, carNumber);
                    System.out.printf("%s registered %s successfully%n", user, carNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", ownerAndCarsMap.get(user));
                }
            }

            else if (command.equals("unregister")) {
                String user = currentData[1];

                if (!ownerAndCarsMap.containsKey(user)) {
                    System.out.printf("ERROR: user %s not found%n", user);
                } else {
                    ownerAndCarsMap.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);
                }
            }
        }
        ownerAndCarsMap.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}
        //5
        //register John CS1234JS
        //register George JAVA123S
        //register Andy AB4142CD
        //register Jesica VR1223EE
        //unregister Andy

        //register : 1. Ako вече потребителят има регистрирана кола --> "ERROR: already registered with plate number номера на регистрираната кола"
        //           2. Ако не е регистрирал кола                   --> "Потребител registered номер на регистрираната кола successfully"

        //unregister : 1. Ако потребителят не е регистрирал кола    --> "ERROR: user името на потребителя not found"
        //             2. Ако потребителят е регистрирал кола       --> "Име на потребителя  unregistered successfully"

        //John registered CS1234JS successfully
        //George registered JAVA123S successfully
        //Andy registered AB4142CD successfully
        //Jesica registered VR1223EE successfully
        //Andy unregistered successfully
        //John => CS1234JS
        //George => JAVA123S
        //Jesica => VR1223EE

