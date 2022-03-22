package T07AssociateArraysDictionaries.Exercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> sidesAndUsersMap = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String[] data = input.split("\\s+\\|\\s+");
                String forceSide = data[0];
                String forceUser = data[1];

                sidesAndUsersMap.putIfAbsent(forceSide, new ArrayList<>());
                boolean isTheForceUserInTheMap = sidesAndUsersMap.entrySet().stream().anyMatch(entry -> entry.getValue().contains(forceUser));

                if (!isTheForceUserInTheMap) {
                    sidesAndUsersMap.get(forceSide).add(forceUser);
                }

            } else if (input.contains("->")) {
                String[] data = input.split("\\s+\\->\\s+");
                String forceUser = data[0];
                String forceSide = data[1];


                sidesAndUsersMap.forEach((key, value) -> value.remove(forceUser));

                sidesAndUsersMap.putIfAbsent(forceSide, new ArrayList<>());
                sidesAndUsersMap.get(forceSide).add(forceUser);

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);


            }
            input = scanner.nextLine();

        }

         sidesAndUsersMap.forEach(  (key, value) -> {

             if (!value.isEmpty()) {

                 System.out.printf("Side: %s, Members: %d%n", key, value.size());
                 value.forEach(forceUser -> System.out.printf("! %s%n", forceUser));

             }

         });


        //   for (Map.Entry<String, List<String>> entry : sidesAndUsersMap.entrySet()) {
        //      if (!entry.getValue().isEmpty()) {
        //          System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());

        //          for (int i = 0; i < entry.getValue().size(); i++) {
        //               System.out.printf("! %s%n", entry.getValue().get(i));
        //           }

        //     }
        //   }


    }
}


// force_side | force_user  :  1. Ako няма нито форсюзър, нито форссайд  --> се добавя нов форссайд и  форсюзър към съответстващия форссайд
//                             2. Ако няма форсюзър към дадения форссайд --> се добавя форсюзър към съответстващия форссайд
//                             3. Ако вече има такъв форсюзър            --> се пропуска командата и се продължава към следващата операция

// force_user -> force_side :  1. Ако вече има такъв форсюзър            --> се променя неговата форссайд
//                             2. Ако няма форсюзър към дадения форссайд --> се добавя форсюзър към съответстващия форссайд
//                             3. Ако няма нито такъв форсюзър, нито такъв форссайд --> се добавя нов форссайд и  форсюзър към съответстващия форссайд
//                             и се принтира "{force_user} joins the {force_side} side!".

//Light | Peter
//Dark | Kim
//Lumpawaroo

//

//Side: Light, Members: 1
//! Peter
//Side: Dark, Members: 1
//! Kim

