import java.util.*;

public class MissingUsingHash {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9};
        int min = 1;
        int max = 9;
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }

        System.out.print("Missing values: ");
        for (int num = min; num <= max; num++) {
            if (!set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
