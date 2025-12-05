public class sumofnnumbers{
    public static void main(String args[]){
        System.out.println(add(5));
    }
    public static int add(int num){
        if(num==0){
            return 0;
        }else{
            return num + add(num-1);
        }
    }
}