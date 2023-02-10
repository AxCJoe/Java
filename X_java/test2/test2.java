package test2;

import java.util.Scanner;

    public class test2 {
    
        public static void main(String[] args) {

          System.out.println("歡迎使用郵編查詢程序:↓");
          System.out.println("請輸入:已知或未知的郵編7位數字");
          System.out.println("全功能測試命令:2100026,2100818,2100821,2100806,2100825,2110021,2110031,2110032,2110033,2110061,111,2222222");
          System.out.println();
          // 输入内容
          System.out.print("請輸入内容:");

          
          Scanner inp = new Scanner(System.in);
          String str = inp.nextLine();

          // 将一个字符串分割为子字符串，然后将结果作为字符串数组返回
          // 若输入两组字符串请用逗号隔开，将转换成可查询的两组字符串
          String[] strArray = str.split(",");

          // item放置遍历strArray得到的每一个元素 并输出
          for (String item : strArray) {
            System.out.println("這裏輸入的内容是: " + item);
          }
          // 制作 table 数组
          String[] table1 = {"2100026", "2100818", "2100821", "2100806", "2100825"};
          String[] table1Name = {"堤根", "中瀬", "殿町", "中島", "出來野"};
          String[] table2 = {"2110021", "2110031", "2110032", "2110033", "2110061"};
          String[] table2Name = {"住吉町", "大町", "木月 伊勢町", "紙圓町", "小彬"};

          //得到数组后进行7位对比  根据输入的字符串次数，将决定返回次数，优先输入顺序执行
          for (String item : strArray) {
            if (item.length() == 7) 
            {
              int found = 0;
              for (int i = 0; i < table1.length; i++) {
                if (item.equals(table1[i])) {
                  System.out.println("在table1中,名字是 [" + table1Name[i] + "]");
                  // found赋值给1准备跳出
                  found = 1;
                  break;
                }
              }

              if (found == 0) {
                for (int i = 0; i < table2.length; i++)
                 {
                  if (item.equals(table2[i]))
                   {
                    System.out.println("在table2中,名字是 [" + table2Name[i] + "]");
                    found = 1;
                    break;
                  }
                }
              }
              // 若上面输入的7位数字里没有匹配到table1-2里的数组，将会被执行for将会遍历if直到匹配，否则found一直为0。
              if (found == 0) {
                System.out.println("没有找到這个郵編地址");
              }

            } 

            //若上面输出内容不为7位数则执行 
             else if(item.length() != 7){
              System.out.println("[" + item + "] 不是郵編");
             }
             
          }
        }
     }

