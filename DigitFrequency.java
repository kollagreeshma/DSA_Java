import java.util.HashMap;

public class DigitFrequency {
    public static void main(String[] args) {
        int num = 112256;

        // HashMap to store digit -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        while (num != 0) {
            int digit = num % 10;
            map.put(digit, map.getOrDefault(digit, 0) + 1);
            num /= 10;
        }

        // Print digit frequencies
        System.out.println("Digit Frequencies: " + map);
    }
}
