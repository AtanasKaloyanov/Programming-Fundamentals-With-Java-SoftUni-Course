package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companiesAndIDsMap = new LinkedHashMap<>();

        while (!input.equals("End")) {

            String[] data = input.split(" -> ");

            String company = data[0];
            String ID = data[1];

            if (!companiesAndIDsMap.containsKey(company)) {
                companiesAndIDsMap.put(company, new ArrayList<>());
                companiesAndIDsMap.get(company).add(ID);
            } else {
                if (!companiesAndIDsMap.get(company).contains(ID)) {
                    companiesAndIDsMap.get(company).add(ID);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companiesAndIDsMap.entrySet()) {

            System.out.printf("%s%n", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {

                System.out.printf("-- %s%n", entry.getValue().get(i));

            }
        }


    }
}
// 1, 2 , 3, 4

//SoftUni -> AA12345
//SoftUni -> BB12345
//Microsoft -> CC12345
//HP -> BB12345
//End

//SoftUni
//-- AA12345
//-- BB12345
//Microsoft
//-- CC12345
//HP
//-- BB12345
