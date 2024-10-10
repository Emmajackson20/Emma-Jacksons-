import java.util.ArrayList;

public class assigmentarraylist1 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access elements
        System.out.println("First element: " + list.get(0));

        // Remove an element
        list.remove("Banana");

        // Display the ArrayList
        System.out.println("ArrayList: " + list);
    }
}
