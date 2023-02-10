package JSample;

public class JSample12_3 {

    //クラスメンバ変数の宣言・生成
    static String classV = "クラス変数classV";
    //クラスメソッドの宣言
    static void classM() {
        System.out.println("クラスメソッドclassM");
    }
    public static void main(String[] args) {
        //クラス名を通してクラス変数を参照
        System.out.println(JSample12_3.classV);
        //クラス名を通してクラスメソッドを参照
        JSample12_3.classM();
    }
}
