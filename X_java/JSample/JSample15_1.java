package JSample;

import java.util.ArrayList;

public class JSample15_1 {

    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("バナナ");
        al.add("葡萄");
        al.add("梨");
        al.add("イチゴ");
        al.add("リンゴ");
        System.out.println("登録したデータの数：" + al.size() + "個");
        for (int i = 0; i < al.size(); i++) {
            String out = al.get(i);
            System.out.println(out);
        }
        System.out.println("一番名の果物をイチゴへ置き換えます");
        al.set(0, "イチゴ");
        al.set(3, "バナナ");
        for (int i = 0; i < al.size(); i++) {
            String out = al.get(i);
            System.out.println(out);
        }
    }
}
