package T07AssociateArraysDictionaries.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> namesAndAges = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] data = input.split(" ");
            String name = data[0];
            String age = data[1];

            namesAndAges.put(name, age);

            input = scanner.nextLine();
        }

        namesAndAges.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));

        //  sidesAndUsersMap.forEach((key, value) -> {
        //            if (!value.isEmpty()) {
        //
        //                System.out.printf("Side: %s, Members: %d%n", key, value.size());
        //                value.forEach(forceUser -> System.out.printf("! %s%n", forceUser));
        //
        //            }
        //        });

    }
}
