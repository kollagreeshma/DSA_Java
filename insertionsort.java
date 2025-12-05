public class insertionsort {

    public static void insertion(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 7, 1, 8, 3, 9, 0};

        System.out.println("Before Sorting:");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        insertion(arr);

        System.out.println("\nAfter Sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
