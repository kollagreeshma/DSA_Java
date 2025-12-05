import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "mississippi";

        // LinkedHashMap preserves the order of characters
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print character frequencies
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
