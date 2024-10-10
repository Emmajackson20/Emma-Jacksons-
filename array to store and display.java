import java.util.ArrayList;

public class StoreDisplayArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Display elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
