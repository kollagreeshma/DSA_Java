import java.util.*;
public class Task7 {
    public static void main(String[] args) {
        String str = "Java java JAVA Code coDe ";
        str = str.toLowerCase();
        String[] arr = str.split("\\s+");  

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
