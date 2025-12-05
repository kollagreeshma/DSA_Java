public class bubblesort {
    public static int bubbleSort(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-i-1;j++){
                if (arr[j]< arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;

                }
            }
            System.out.println();
            for(Object k : arr){
                System.out.print(k+" ");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,3,7,8,9,5,2,7,8};
        System.out.println("before sort.........");
        for(int i : arr){
            System.out.print(i+" ");
        }
        bubbleSort(arr);
        System.out.println();
        System.out.println("after sort.........");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    }
