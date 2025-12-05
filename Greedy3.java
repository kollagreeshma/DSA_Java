import java.util.*;

class Items {
    int w, p;
    double ratio;

    public Items(int w, int p) {
        this.w = w;
        this.p = p;
        ratio = (double) p / w;
    }
}
public class Greedy3 {
    public static void main(String[] args) {
        Items[] Item = {
            new Items(10,60),
            new Items(20,100),
            new Items(30,120),
        };
        int capacity = 50;
        double profit = 0.0;
        Arrays.sort(Item, (a, b) -> Double.compare(b.ratio, a.ratio));

        for (Items it : Item) {
            if (capacity >= it.w) {
                profit += it.p;
                capacity -= it.w;
            } else {
                profit += it.ratio * capacity;
                break;
            }
        }

        System.out.println("Maximum Profit = " + profit);
    }
}
