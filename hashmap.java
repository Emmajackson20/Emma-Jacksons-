import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Access elements
        System.out.println("Value for key 'Two': " + map.get("Two"));

        // Display the HashMap
        System.out.println("HashMap: " + map);
    }
}
