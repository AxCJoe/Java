package JSample;

public class JSample11_4 {
    
    //メソッドから呼び出し元に値を返す場合。
    //・return文
    public static void main(String[] args) {
        int kekka;
        kekka = bai(5);
        System.out.println(kekka);
    }
    private static int bai(int n) {
        return n * 2;
    }

}
