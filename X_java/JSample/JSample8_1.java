package JSample;

public class JSample8_1 {

    public static void main(String[] args) {
        System.out.println("サイズが小さい型から大きい型への変換");
        int i = 7;
        double j = i;
        System.out.println("変換前：" + i);
        System.out.println("変換後：" + j);
        System.out.println("サイズが大きい型から小さい型への変換");
        double a = 1.25;
        int b = (int) a;
        System.out.println("変換前：" + a);
        System.out.println("変換後：" + b);
    }
    
}
