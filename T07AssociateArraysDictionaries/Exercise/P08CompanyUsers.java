package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 2. Adding students and their grade in a map via while cycle
        Map<String, Set<String>> employeesIdSetsByCompanies = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] currentArray = input.split(" -> ");
            String currentCompanyName = currentArray[0];
            String currentEmployeeName = currentArray[1];

            employeesIdSetsByCompanies.putIfAbsent(currentCompanyName, new LinkedHashSet<>());
            employeesIdSetsByCompanies.get(currentCompanyName).add(currentEmployeeName);

            input = scanner.nextLine();
        }

        // 3. Output printing
        employeesIdSetsByCompanies.forEach( (companyName, employeesSet) -> {
            System.out.println(companyName);
            for (String employee : employeesSet) {
                System.out.printf("-- %s\n", employee);
            }
        });
    }
}

