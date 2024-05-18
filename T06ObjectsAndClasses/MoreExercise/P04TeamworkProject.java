package T06ObjectsAndClasses.MoreExercise;

import java.util.*;

public class P04TeamworkProject {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //   team   creator
        Map<String, String> creatorsByTeam = new TreeMap<>();
        // creator    members
        Map<String, Set<String>> membersSetByCreator = new HashMap<>();
        // members
        Set<String> members = new HashSet<>();

        // 2. Creating of the teams
        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split("-");
            String currentCreator = currentArray[0];
            String currentTeam = currentArray[1];

            if (creatorsByTeam.containsKey(currentTeam)) {
                System.out.printf("Team %s was already created!\n", currentTeam);
            } else if (membersSetByCreator.containsKey(currentCreator)) {
                System.out.printf("%s cannot create another team!\n", currentCreator);
            } else {
                creatorsByTeam.put(currentTeam, currentCreator);
                membersSetByCreator.put(currentCreator, new TreeSet<>());
                members.add(currentCreator);
                System.out.printf("Team %s has been created by %s!\n", currentTeam, currentCreator);
            }
        }

        // 3. Adding members to the team
        String input = scanner.nextLine();
        while (!input.equals("end of assignment")) {
            String[] currentArray = input.split("->");
            String currentMember = currentArray[0];
            String currentTeam = currentArray[1];

            if (!creatorsByTeam.containsKey(currentTeam)) {
                System.out.printf("Team %s does not exist!\n", currentTeam);
            } else if (members.contains(currentMember)) {
                System.out.printf("Member %s cannot join team %s!\n", currentMember, currentTeam);
            } else {
                String currentCreator = creatorsByTeam.get(currentTeam);
                membersSetByCreator.get(currentCreator).add(currentMember);
                members.add(currentMember);
            }

            input = scanner.nextLine();
        }

        // 4. Output printing: If the team has only a creator adding the team to list.
        // In other case printing the output.
        // Finally printing the information from the list.
        Set<String> teamsOnlyWithCreator = new TreeSet<>();

        creatorsByTeam.entrySet().stream()
                .sorted( (entry1, entry2) -> {
                    String team1 = entry1.getKey();
                    String team2 = entry2.getKey();
                    String creator1 = entry1.getValue();
                    String creator2 = entry2.getValue();

                    Set<String> members1 = membersSetByCreator.get(creator1);
                    Set<String> members2 = membersSetByCreator.get(creator2);

                    int result = Integer.compare(members2.size(), members1.size());
                    if (result == 0) {
                        result = team1.compareTo(team2);
                    }

                    return result;
                }).forEach( (entry) -> {
                    String team = entry.getKey();
                    String creator = entry.getValue();
                    Set<String> users = membersSetByCreator.get(creator);
                    if (users.size() == 0) {
                        teamsOnlyWithCreator.add(team);
                    } else {
                        System.out.println(team);
                        System.out.printf("- %s\n", creator);
                        for (String user : users) {
                            System.out.printf("-- %s\n", user);
                        }
                    }
                });

        System.out.println("Teams to disband:");
        for (String team : teamsOnlyWithCreator) {
            System.out.println(team);
        }
    }
}
