package JSample;

class Circle {
    final double PI = 3.14159;//final変数PIの宣言、初期化
    final double getAreaOfCircle(double radius) {//finalメソッド宣言
        return PI * radius * radius;//円の面積
    }
}
public class JSample13_6 {
    public static void main(String[] args) {
        Circle circle = new Circle();//Circleクラスのオブジェクト作成
        double area = circle.getAreaOfCircle(2.0);//半径2.0の面積
        System.out.println("area = " + area);
    }
}