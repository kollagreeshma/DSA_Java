public class even{
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isOdd(5));
    }
    public static boolean  isEven(int num){
        if(num==0){
            return true;
        }
        return isOdd(num-1);
        }
    public static boolean  isOdd(int num){
        if(num==0){
            return false;
        }
        return isEven(num-1);
        }
    }

