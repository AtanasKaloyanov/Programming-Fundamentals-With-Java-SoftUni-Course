package T06ObjectsAndClasses.Exercise;


import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {
    private final static String[] PHRASES = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
    private final static String[] EVENTS = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
    private final static String[] AUTHORS = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    private final static String[] CITIES = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 2. Using of class Random for a random message
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int randomPhraseIndex = random.nextInt(PHRASES.length);
            int randomEventIndex = random.nextInt(EVENTS.length);
            int randomAuthorIndex = random.nextInt(AUTHORS.length);
            int randomCityIndex = random.nextInt(CITIES.length);

            String randomPhrase = PHRASES[randomPhraseIndex];
            String randomEvent = EVENTS[randomEventIndex];
            String randomAuthor = AUTHORS[randomAuthorIndex];
            String randomCity = CITIES[randomCityIndex];

            System.out.printf("%s %s %s – %s\n", randomPhrase, randomEvent, randomAuthor, randomCity);
        }
    }

}
