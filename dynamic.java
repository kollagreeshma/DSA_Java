public class dynamic {
    public static void main(String[] args) {
        int n=6;
        int[] d= new int[n];
        d[0] = 0;
        d[1] = 1;
        for(int i=2;i<n;i++){
            d[i] = d[i-1] + d[i-2];
        }
        System.out.println(d[n-1]);
    }
    
}
