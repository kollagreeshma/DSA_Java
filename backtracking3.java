/*ABC
ACB
BAC
BCA
CAB
CBA */
public class backtracking3 {

    public static void subStringtrace(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            String result = str.substring(0, i) + str.substring(i + 1);
            subStringtrace(result, ans + s);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        subStringtrace(str, "");
    }
}

    /*public static void subArrays(char[] arr,int index){
        if(index == arr.length){
            for(char ch :arr){
                System.out.print(ch+" ");
            }
            System.out.println();
            return;
        }
        for(int j = index;j<arr.length;j++){
            char temp = arr[index];
            arr[index] = arr[j];
            arr[j] = temp;

            subArrays(arr, index+1);

            temp = arr[index];
            arr[index] = arr[j];
            arr[j] = temp;

        }
    }
    public static void main(String[] args) {
        char[] arr = {'A','B','C'};
        subArrays(arr, 0);
        
    }*/