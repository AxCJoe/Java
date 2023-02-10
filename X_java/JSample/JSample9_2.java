package JSample;

public class JSample9_2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        //car1というオブジェクトを作成
        car1.color = "red";
        System.out.println("元々あるバッテリー量は、" + car1.battery + "です");
        car1.go();
        car1.charge();
    }
}
