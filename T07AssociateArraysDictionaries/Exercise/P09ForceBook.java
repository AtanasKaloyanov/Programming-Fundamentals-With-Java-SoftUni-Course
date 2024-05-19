package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Commands implementations - 2 commands - 5 cases.
        //forceUser
        Set<String> forceUsers = new HashSet<>();

        // forceUser   forceUser
        Map<String, Set<String>> forceUsersSetsByForceSides = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (canVertBarSplit(input)) {
                String[] currentArray = input.split(" \\| ");
                String currentForceSide = currentArray[0];
                String currentForceUser = currentArray[1];

                if (!forceUsers.contains(currentForceUser) && !forceUsersSetsByForceSides.containsKey(currentForceSide)) {
                    forceUsersSetsByForceSides.put(currentForceSide, new LinkedHashSet<>());
                    forceUsersSetsByForceSides.get(currentForceSide).add(currentForceUser);
                    forceUsers.add(currentForceUser);
                } else if (!forceUsers.contains(currentForceUser) && forceUsersSetsByForceSides.containsKey(currentForceSide)) {
                    forceUsersSetsByForceSides.get(currentForceSide).add(currentForceUser);
                    forceUsers.add(currentForceUser);
                }
            } else {
                String[] currentArray = input.split(" -> ");
                String currentForceUser = currentArray[0];
                String currentForceSide = currentArray[1];

                if (forceUsers.contains(currentForceUser)) {
                    for (Map.Entry<String, Set<String>> entry : forceUsersSetsByForceSides.entrySet()) {
                        boolean userForRemoving = entry.getValue().remove(currentForceUser);
                        if (userForRemoving) {
                            break;
                        }
                    }

                    forceUsersSetsByForceSides.putIfAbsent(currentForceSide, new LinkedHashSet<>());
                    forceUsersSetsByForceSides.get(currentForceSide).add(currentForceUser);
                } else if (!forceUsers.contains(currentForceUser) && forceUsersSetsByForceSides.containsKey(currentForceSide)) {
                    forceUsersSetsByForceSides.get(currentForceSide).add(currentForceUser);
                } else if (!forceUsers.contains(currentForceUser) && !forceUsersSetsByForceSides.containsKey(currentForceSide)) {
                    forceUsersSetsByForceSides.put(currentForceSide, new LinkedHashSet<>());
                    forceUsersSetsByForceSides.get(currentForceSide).add(currentForceUser);
                    forceUsers.add(currentForceUser);
                }

                System.out.printf("%s joins the %s side!\n", currentForceUser, currentForceSide);
            }
            input = scanner.nextLine();
        }

        // 3. Output printing:
        forceUsersSetsByForceSides.forEach((forceSide, forceUsersSet) -> {
            if (!forceUsersSet.isEmpty()) {
                System.out.printf("Side: %s, Members: %d\n", forceSide, forceUsersSet.size());
                for (String forceUser : forceUsersSet) {
                    System.out.printf("! %s\n", forceUser);
                }
            }
        });
    }

    private static boolean canVertBarSplit(String input) {
        try {
            String[] array = input.split(" \\| ");
            String forceSide = array[0];
            String forceUser = array[1];
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}



