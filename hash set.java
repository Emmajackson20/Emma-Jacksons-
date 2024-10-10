import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Dog");
        set.add("Cat");
        set.add("Bird");
        set.add("Dog"); // Duplicate element

        // Display the HashSet
        System.out.println("HashSet: " + set);
    }
}
