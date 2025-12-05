import java.util.*;
public class Task {
    public static void main(String[] args) {
        
        int[] arr = {2, 7, 11, 15, 5, 3};
        int target = 10;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                System.out.println(arr[i]+"+"+temp +"="+target);
                return;
            }
            map.put(arr[i],i);
        }
    }
}