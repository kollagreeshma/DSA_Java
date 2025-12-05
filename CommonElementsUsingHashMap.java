import java.util.HashMap;

public class CommonElementsUsingHashMap {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 1, 5};
        int[] arr2 = {6, 7, 9, 3, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store elements of arr1 in HashMap
        for (int num : arr1) {
            map.put(num, 1);   // mark as present
        }

        System.out.print("Common Elements: ");

        // Check elements of arr2 in HashMap
        for (int num : arr2) {
            if (map.containsKey(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
