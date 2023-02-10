package JSample;

public class SetNumber {

    private int basicNum;
    private int specialNum;
    //int型の引数を持つコンストラクタ
    public SetNumber(int spn) {
        this.basicNum = 100;
        this.specialNum = spn;
    }

    //引数を持たないコンストラクタ
    public SetNumber() {
        this.basicNum = 100;
        this.specialNum = 500;
    }
    
    public static void main(String[] args) {
        //コンストラクタの呼び出し、引数を指定しない
        SetNumber insA = new SetNumber();
        System.out.println("insAのSetNumber()でbasicNumは" + insA.basicNum+"です");
        System.out.println("insAのSetNumber()でspecialNumは" + insA.specialNum+"です");
        //コンストラクタの呼び出しにint型の引数1つを指定
        SetNumber insB = new SetNumber(1000);
        System.out.println("insBのSetNumber(1000)でbasicNumは" + insB.basicNum+"です");
        System.out.println("insBのSetNumber(1000)でspecialNumは" + insB.specialNum+"です");
    }
}
