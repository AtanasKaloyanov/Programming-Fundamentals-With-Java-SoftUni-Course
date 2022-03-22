package T07AssociateArraysDictionaries.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Integer>> products = new LinkedHashMap<>();

      String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] data = input.split(" ");

            String name = data[0];
            int number = Integer.parseInt(data[1]);

            products.putIfAbsent(name, new ArrayList<>());

           boolean nonematch =  products.get(name).stream().noneMatch(p -> p.equals(number)) ;

           if (nonematch) {
               products.get(name).add(number);
           }

            input = scanner.nextLine();

        }
            products.forEach((k, v) -> System.out.printf("%s -> %s%n",k , v.toString().replaceAll("[\\[\\]]", "")));
    }
}
