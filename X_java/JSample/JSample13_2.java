package JSample;


    class Parent132 {
        public String ps1 = "親クラスのメンバ変数が参照されました。";
        public Parent132() {
            System.out.println("親クラスのコンストラクタ（引数なし）が呼ばれました。");
        }
        public void pm() {
            System.out.println("親クラスのメソッドが呼ばれました。");
        }
    }
    class Child132 extends Parent132 { // Parentクラス（親クラス）を継承。
        public String cs1 = "子クラスのメンバ変数が参照されました。";
        public Child132() {
            System.out.println("自クラスのコンストラクタ（引数なし）が呼ばれました。");
        }
        public void cm() {
            System.out.println("子クラスのメソッドが呼ばれました。");
        }
    }
    public class JSample13_2 {
        public static void main(String[] args) {
            Child132 child = new Child132(); // 子クラスのインスタンスを生成。
            System.out.println(child.ps1); // 親クラスのメンバ変数を参照。
            System.out.println(child.cs1); // 子クラスのメンバ変数を参照。
            child.pm(); // 親クラスのメソッドの呼び出し。
            child.cm(); // 子クラスのメソッドの呼び出し。
        }
    } 

