public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 1, 5};
        int[] arr2 = {6, 7, 9, 3, 5};

        System.out.print("Common Elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;  // Stop inner loop once a match is found
                }
            }
        }
    }
}
