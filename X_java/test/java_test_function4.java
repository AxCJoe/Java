
package test;


import java.util.Scanner;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

public class java_test_function4 {


    public static void main(String[] args) {

        System.out.println("8桁の文字列を入力してください。");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");
        String[] inputArray1 = sc1.nextLine().split(" ");
    
        if (inputArray.length == 0) {
          System.out.println("入力した文字列の配列のサイズが0です。");
          return;
        }
    
        for (int i = 0; i < inputArray.length; i++) {
          if (inputArray[i].length() != 8)
          {
            
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が８桁の文字列ではありません。");
        
            
          }
          if(inputArray1[i].length()!=8)
            {
                System.out.println((i + 2) + "番目の文字列「" + inputArray1[i] + "」が８桁の文字列ではありません。");
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
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            sdf.parse(inputArray[i]);
        } 
            catch (ParseException e) 
        {
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が日付ではありません。");
            // continue;
        }
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sdf.parse(inputArray[i]));
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int week = calendar.get(Calendar.DAY_OF_WEEK);
            String leapOrCommon = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "閏年" : "平年";
            String monthStr = String.format("%02d", month);
            String dayStr = String.format("%02d", day);
            String weekStr = "";
        switch (week) {
            case Calendar.SUNDAY:
                weekStr = "日曜日";
                break;
            case Calendar.MONDAY:
                weekStr = "月曜日";
                break;
            case Calendar.TUESDAY:
                weekStr = "火曜日";
                break;
            case Calendar.WEDNESDAY:
                weekStr = "水曜日";
                break;
            case Calendar.THURSDAY:
                weekStr = "木曜日";
                break;
            case Calendar.FRIDAY:
                weekStr = "金曜日";
                break;
            case Calendar.SATURDAY:
                weekStr = "土曜日";
                break;
        }

        System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」" + "が"+ leapOrCommon+"、"+ year + "年"+ monthStr + "月" + dayStr + "日、" + weekStr + "です。");

        } catch (ParseException e) {
            e.printStackTrace();
            
            continue;
        }
        
        

        
        }
        
    }
}


        
        
    

    


