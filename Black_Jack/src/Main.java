import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        String[] card_signs = {" of Spades", " of Diamonds", " of Hearts", " of Clubs"};
        String[] card_numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        List<String> combinations = new ArrayList<>();

        for (String c1 : card_numbers) {
            for (String c2 : card_signs) {
                combinations.add(c1 + c2);
            }
        }
        /*
        if (str.startsWith(arg)){
            return arg, args value
        } else if {

        }*/
    }

    public static String[] random_card(String[] args){
            // Create an array of items
            String[] items = {"Apple", "Banana", "Orange", "Grapes"};

            // Create a Random object
            Random random = new Random();

            // Get a random index within the bounds of the array
            int randomIndex = random.nextInt(items.length);

            // Get the random item from the array
            String randomItem = items[randomIndex];

            // Print the random item
            System.out.println("Random item: " + randomItem);
    }
}
