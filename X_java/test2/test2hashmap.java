package test2;

import java.util.HashMap;
import java.util.Scanner;

public class test2hashmap {
        
        public static void main(String[] args) {

        System.out.println("歡迎使用郵編查詢程序:↓");
        System.out.println("請輸入:已知或未知的郵編7位數字");
        System.out.println("全功能測試命令:2100026,2100818,2100821,2100806,2100825,2110021,2110031,2110032,2110033,2110061,111,2222222");
        System.out.println();

        HashMap<String, String> table1 = new HashMap<>();
        table1.put("2100026", "堤根");
        table1.put("2100825", "出来野");
        table1.put("2100821", "殿町");
        table1.put("2100806", "中島");
        table1.put("2100818", "中瀬");
        HashMap<String, String> table2 = new HashMap<>();
        table2.put("2110032", "木月 伊勢町");
        table2.put("2110031", "大町");
        table2.put("2110033", "紙圓町");
        table2.put("2110021", "住吉町");
        table2.put("2110061", "小彬");
    
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入内容: ");
        String str = input.nextLine();
    
        String[] strArray = str.split(",");
        for (String item : strArray) {
        boolean found = false;
        if (item.length() == 7 && item.matches("[0-9]+")) {
            if (table1.containsKey(item)) {
                System.out.println("在table1中,名字是[" + table1.get(item) + "]");
                found = true;
            } else if (table2.containsKey(item)) {
                System.out.println("在table2中,名字是[" + table2.get(item) + "]");
                found = true;
            }
            if (!found) {
                System.out.println("没有找到這个郵編地址");
            }
        } else {
            System.out.println("[" + item + "]不是郵編");
        }
    }
}
}
