package T06ObjectsAndClasses.Exercise;

import java.util.Locale;

public class Demo2 {
    public static void main(String[] args) {

        String catName = "shoho";
        String printName = catName.toUpperCase().charAt(0) + catName.substring(1);

        System.out.println(printName);

    }
}
