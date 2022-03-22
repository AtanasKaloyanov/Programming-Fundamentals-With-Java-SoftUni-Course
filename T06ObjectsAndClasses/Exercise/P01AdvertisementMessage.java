package T06ObjectsAndClasses.Exercise;


import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {
    public static class Message {
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] autors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        public void printing(int number) {
            for (int i = 1; i <= number; i++) {

            Random random = new Random();

            int randomPhrase = random.nextInt(phrases.length);
            int randomEvent = random.nextInt(events.length);
            int randomAuthor = random.nextInt(autors.length);
            int randomCity = random.nextInt(cities.length);

                System.out.printf("%s %s %s - %s%n", this.phrases[randomPhrase], this.events[randomEvent], this.autors[randomAuthor], this.cities[randomCity]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPrinting = Integer.parseInt(scanner.nextLine());

        Message message = new Message();

        message.printing(numberOfPrinting);

    }

}
