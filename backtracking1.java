/*123 
12 
13
1
23
2
3 */
public class backtracking1 {

    public static void SingleSubSet(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println(current + " ");
            return;
        }
        SingleSubSet(arr, index + 1, current + arr[index]);
        SingleSubSet(arr, index + 1, current);
    }
    public static void main(String args[]) {
        int[] arr = {1, 2,3};
        SingleSubSet(arr, 0, "");
    }
}

