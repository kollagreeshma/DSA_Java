public class findmaxrecursion {

    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return Math.max(arr[index], findMax(arr, index + 1));
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 98, 45, 62};

        int max = findMax(arr, 0); 
        System.out.println("Maximum value in array: " + max);
    }
}
