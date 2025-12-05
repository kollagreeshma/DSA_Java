public class selectionsort {
    public static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 8, 3, 2, 10, 7, 1};

        System.out.println("Before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        selection(arr);
        System.out.println("After sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
