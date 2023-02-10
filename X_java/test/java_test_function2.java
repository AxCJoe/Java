package test;

import java.util.Scanner;

public class java_test_function2 {

    public static void main(String[] args) {

        System.out.println("文字列を入力してください。");
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");
    
        if (inputArray.length == 0) {
          System.out.println("入力した文字列の配列のサイズが0です。");
          return;
        }
    
        for (int i = 0; i < inputArray.length; i++) {
          if (inputArray[i].length() != 8) {
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が８桁の文字列ではありません。");
          }
        try {
            Long.parseLong(inputArray[i]);
        } catch (NumberFormatException e) {
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が８桁の数値ではありません。");
            continue;
        }
        }

        


      }    

    
}
