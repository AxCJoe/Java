package JSample;

public class Car {
    String color;
    //属性として、色の宣言
    int battery = 100;
    //属性として、元々のバッテリーは100あると宣言
    void go() {
        //操作として、アクセルという動作の説明
        this.battery -= 10;
        //バッテリーを10使う操作である
        System.out.println("バッテリーを10使用しました");
        System.out.println("現在のバッテリーは、" + battery + "です");
    }
    void charge() {
        //操作として、充電という動作の説明
        this.battery += 50;
        System.out.println("バッテリーを50充電しました");
        System.out.println("現在のバッテリーは、" + battery + "です");
    }
}
