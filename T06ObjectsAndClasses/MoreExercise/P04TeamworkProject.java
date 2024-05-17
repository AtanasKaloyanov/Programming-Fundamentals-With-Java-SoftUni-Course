package T06ObjectsAndClasses.MoreExercise;

import java.util.*;

public class P04TeamworkProject {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // creator   team
        Set<String> creators = new HashSet<>();
        // team
        Set<String> teams = new HashSet<>();
        //   team       member
        Map<String, Set<String>> membersSetByTeam = new LinkedHashMap<>();
        //   member  team
        Map<String, String> teamsByMember = new LinkedHashMap<>();

        // 2. Creating of the teams
        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split("-");
            String currentCreator = currentArray[0];
            String currentTeam = currentArray[1];

            if (teams.contains(currentTeam)) {
                System.out.printf("Team %s was already created!\n", currentTeam);
            } else if (creators.contains(currentCreator)) {
                System.out.printf("%s cannot create another team!\n", currentCreator);
            } else {
                System.out.printf("Team %s has been created by %s!\n", currentTeam, currentCreator);
                creators.add(currentCreator);
                teams.add(currentTeam);
                membersSetByTeam.putIfAbsent(currentTeam, new TreeSet<>());
                membersSetByTeam.get(currentTeam).add(currentCreator);
                teamsByMember.put(currentCreator, currentTeam);
            }
        }

        // 3. Adding members to the team
        String input = scanner.nextLine();
        while (!input.equals("end of assignment")) {
            String[] currentArray = input.split("->");
            String currentUser = currentArray[0];
            String currentTeam = currentArray[1];

            if (!teams.contains(currentTeam)) {
                System.out.printf("Team %s does not exist!\n", currentTeam);
            } else if (teamsByMember.containsKey(currentUser)) {
                System.out.printf("Member %s cannot join team %s!\n", currentUser, currentTeam);
            } else {
                membersSetByTeam.get(currentTeam).add(currentUser);
                teamsByMember.put(currentUser, currentTeam);
            }

            input = scanner.nextLine();
        }

        // Output printing:
        List<String> teamsToDisband = new ArrayList<>();
        membersSetByTeam.entrySet().stream()
                .sorted( (entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()))
                        .forEach( (entry) -> {
                            String currentTeam = entry.getKey();
                            Set<String> currentMembers = entry.getValue();
                            if (currentMembers.size() == 1) {
                                teamsToDisband.add(currentTeam);
                            } else {
                                System.out.println(currentTeam);
                                for (String currentMember : currentMembers) {
                                    
                                    System.out.println(currentMember);
                                }
                            }
                        });

        System.out.println("Teams to disband:");
        for (String team : teamsToDisband) {
            System.out.println(team);
        }
    }
}
