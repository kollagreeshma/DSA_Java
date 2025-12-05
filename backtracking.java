public class backtracking {
    public static void random(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        random(n - 1, ans + "1");
        random(n - 1, ans + "2");
        random(n - 1, ans + "3");
    }

    public static void main(String[] args) {
        random(3, "");
    }
}
