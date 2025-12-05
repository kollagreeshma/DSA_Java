public class start {

    static void print(int n) {
        if (n >10 ) {
            System.out.println("start");   
            return;
        }
        System.out.println(n);  
         print(n + 1);           
    }

    public static void main(String[] args) {
        print(1);   
    }
}


