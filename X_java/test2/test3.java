package test2;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("求合計請結尾輸入：sum");
        System.out.println("求平均請結尾輸入：count");
        System.out.println();
        System.out.println("求合計舉例：m12,dd,3,6,sum");
        System.out.println("求平均舉例：m12,dd,4.5,4.5,count");
        System.out.println();
        System.out.print("請輸入：");
        String input = sc.nextLine();
        String[] inputArr = input.split(",");
        double sum = 0;
        double count = 0;

        //遍历输入的内容检查是否是数字
        for (int i = 0; i < inputArr.length; i++) {
          try {

            double num = Double.parseDouble(inputArr[i]);

            System.out.println(num + " 是数字");
            sum += num;
            count++;
            
          } catch (NumberFormatException e) {
            //不是数字
          }
        }

        //数组末尾检查是否是sum还是count
        String lastInput = inputArr[inputArr.length - 1];

            if (lastInput.equals("sum")) {
                System.out.println("合計：" + sum);
              } else if (lastInput.equals("count")) {
                System.out.println("平均：" + (sum / count));
              }


    //显示现在的时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
    System.out.println("当前時間：" + sdf.format(new Date()));
  }

}