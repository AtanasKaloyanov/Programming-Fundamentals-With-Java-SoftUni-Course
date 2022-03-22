package T07AssociateArraysDictionaries.Exercise;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> studentsInformation = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String[] data = input.split(" : ");

            String course = data[0];
            String person = data[1];

            if (!studentsInformation.containsKey(course)) {
                studentsInformation.put(course, new ArrayList<>());
                studentsInformation.get(course).add(person);
            } else {
                studentsInformation.get(course).add(person);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : studentsInformation.entrySet()) {

            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            for (int i = 0; i < entry.getValue().size(); i++) {

                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }
    }
}

// Programming Fundamentals : John Smith
//Programming Fundamentals : Linda Johnson
//JS Core : Will Wilson
//Java Advanced : Harrison White
//end

//Programming Fundamentals: 2
//-- John Smith
//-- Linda Johnson
//JS Core: 1
//-- Will Wilson
//Java Advanced: 1
//-- Harrison White



