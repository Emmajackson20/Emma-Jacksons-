
		import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] numbers = {5, 3, 8, 1, 2};

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Numbers in descending order: " + Arrays.toString(numbers));
    }
}

	
