package JSample;

import java.util.HashMap;

public class JSample15_2 {
    public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("バナナ", "香蕉");
        map.put("リンゴ", "苹果");
        map.put("イチゴ", "草莓");
        if (map.containsKey("バナナ")) {
            System.out.println("バナナを中国語にすると：");
            System.out.println(map.get("バナナ"));
        } else {
            System.out.println("検索したい果物は存在しません。");
        }
    }
}
