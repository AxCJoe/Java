package JSample;

public class JSample12_2 {

    public static void main(String[] args) {
        ExClass ins1 = new ExClass();
        //クラス変数に100を設定
        ins1.setSize(100);
        ExClass ins2 = new ExClass();
        //クラス変数に300を設定
        ins2.setSize(300);
        //クラス変数は、インスタンス間で値を共有するため、
        //一番最後に設定された300が表示される
        System.out.println(ins1.standardSize);
        System.out.println(ins2.standardSize);
        System.out.println(ExClass.standardSize);
    }
    
}
