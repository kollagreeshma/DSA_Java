public class productrecursion {
    public static void main(String args[]){
        System.out.println(prod(5));
    }
    public static int prod(int num){
        if(num==1){
            return 1;
        }else{
            return num * prod(num-1);
        }
    }
}

