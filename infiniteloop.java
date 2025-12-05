public class infiniteloop {
    
    static void loop() {
        System.out.println("Running...");
        loop(); 
    }

    public static void main(String[] args) {
        loop();
    }
}

