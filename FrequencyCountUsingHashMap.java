import java.util.HashMap;
import java.util.Map;

public class FrequencyCountUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 20, 10, 30, 30};

        // Create a HashMap to store element frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequencies
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequencies
        System.out.println("Element -> Frequency");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
