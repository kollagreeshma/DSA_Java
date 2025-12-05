import java.util.HashSet;

public class DistinctElementCount {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7};

        // Using HashSet to store distinct elements
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Print number of distinct elements
        System.out.println("Number of distinct elements: " + set.size());
    }
}
