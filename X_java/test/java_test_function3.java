package test;


import java.util.Scanner;

import java.text.ParseException;

import java.text.SimpleDateFormat;

public class java_test_function3 {


    public static void main(String[] args) {

        System.out.println("8桁の文字列を入力してください。");
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
        } 
            
            catch (NumberFormatException e) 
        {
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が８桁の数値ではありません。");
            // continue;　//これが入ると次に実行しない、との実験結果でした。
        }
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//yyyyMMddも同じ結果でした。
            sdf.parse(inputArray[i]);
        } 
            catch (ParseException e) 
        {
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が日付ではありません。");
            continue;
        }
            

        }
    }

    
}
