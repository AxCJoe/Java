package JSample;
public class JSample11_1 {
    
    public static void main(String[] args) {
        departure();
        arrive();
        annouce();
    }
    private static void departure() {
        System.out.println("出発します。");
    }
    private static void arrive() {
        System.out.println("到着します。");
    }
    private static void annouce() {
        departure();
        arrive();
    }

}
