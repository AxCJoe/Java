
package test;

//用来构建Scanner对象
import java.util.Scanner;

//表示在解析字符串或其他格式数据时发生的错误。例如，如果您尝试将字符串解析为日期，但字符串的格式不正确，则可能会抛出 ParseException。
import java.text.ParseException;

//日期和时间格式由 日期和时间模式字符串指定。
import java.text.SimpleDateFormat;

//是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
import java.util.Calendar;

public class java_test {


    public static void main(String[] args) {
        System.out.println();
        System.out.println("「このプログラムは閏年／平年と日付を計算する事ができます。」");
        System.out.println("入力事例:「20230201 → 1番目の文字列「20230201」が平年、2023年02月01日、水曜日です。」");
        System.out.println();
        System.out.println("8桁の文字列を入力してください:↓");

        //コンソールINPUT：文字列配列
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");

        // 入力パラメータ（文字列配列）のサイズを判定する。
        // 文字列配列のサイズが0の場合、以下のメッセージを出力し、処理を終了する。
        if (inputArray.length == 0) {
          System.out.println("入力した文字列の配列のサイズが0です。");
          return;
        }
        
            // 入力パラメータ（文字列配列）をループして、1件ずつ以下の処理を行う。

            // 文字列が８桁の文字列であるかを判定する。

            // 文字例が８桁の文字例ではない場合、以下のメッセージを出力し、次の文字列を読み込む。

            // メッセージ内容：○番目の文字列「X」が８桁の文字列ではありません。
        for (int i = 0; i < inputArray.length; i++) {
          if (inputArray[i].length() != 8) {
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が８桁の文字列ではありません。");
          }



            //   文字列が8桁の数値であるかを判断する。

            //   文字例が８桁の数値ではない場合、以下のメッセージを出力し、次の文字列を読み込む。

            //   メッセージ内容：○番目の文字列「X」が８桁の数値ではありません。
        try {
            
            //配列inputArrayの要素iを文字列形式の整数として扱い、「Long.parseLong」 メソッドを使用して、long 型の整数に変換しています。
            //NumberFormatExceptionは、数値の文字列変換で問題が発生した場合にスローされる例外です。この例外をキャッチし、必要なエラー処理を実行することで、例外が発生した場合でもプログラムの実行を続行することができます。
            //Long.parseLong(String)简单来说：是将一个字符串转换成数字的方法。
            Long.parseLong(inputArray[i]);
        } 
            
            catch (NumberFormatException e) 
        {
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が８桁の数値ではありません。");
            // continue;　//これが入ると次に実行しない、との実験結果でした。
        }
        

            // 文字列が日付であるかを判定する。

            // 文字列が日付ではない場合、以下のメッセー ジを出力し、次の文字列を読み込む。
        
            // メッセージ内容：○番目の文字列「X」が日付ではありません。

            //ParseException 表示在解析字符串或其他格式数据时发生的错误。例如，如果您尝试将字符串解析为日期，但字符串的格式不正确，则可能会抛出。
            //异常变量e表示捕获到的ParseException 异常,可以使用它来获取有关该异常的信息.
            //SimpleDateFormat类来将日期格式化为字符串，也可以使用它将字符串解析为日期。
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            sdf.parse(inputArray[i]);
        } 
            catch (ParseException e) //尝试后也可是是其他为定义的变量比如：a,b,c,d等
        {
            System.out.println((i + 1) + "番目の文字列「" + inputArray[i] + "」が日付ではありません。");
            // continue;
        }
        

            // 日付が潤年平年を判定し、下記指定のフォーマットに変換して 、メッセージを出力し 、次の文字列を読み込む。

            // 出力例：
            // 20000101 → 1 番目の文字列「20000101」が潤年、2000年1月1日、土曜日です。
            // 20181111 →　2 番目の文字列「20181111」が平年、2018年 11月11日、月曜日です。

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            Calendar calendar = Calendar.getInstance(); //Calendar.getInstance()是Java中的一个静态方法,它返回一个Calendar对象,该对象表示当前日历。

            //入力した数値をyear month day weekに分類する
            //通过 inputArray[i] 获取字符串格式的日期
            //然后使用SimpleDateFormat类的parse方法将其解析为日期对象
            //最后使用Calendar对象的setTime方法将解析后的日期对象设置为Calendar对象的日期。
            calendar.setTime(sdf.parse(inputArray[i]));
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int week = calendar.get(Calendar.DAY_OF_WEEK);
            
            // "閏年" : "平年"の計算
            //闰年同时满足以下条件：
            //1.年份能被4整除
            //2.年份若是100的整数倍,须被400整除,否则是平年
            String leapOrCommon = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "閏年" : "平年";

            // 文字列フォーマットメソッドを使用して、整数の値（この場合は month 変数）を文字列に変換する
            // %02d は、フォーマット指定子です。これは、次のような意味を持ちます：
            // % 記号：フォーマット指定子の開始を示します。
            // 0：値が 1 桁の場合に先頭に 0 を付けることを指定します。
            // 2：桁数を指定します。値が 2 桁未満の場合は先頭に 0 を付けます。
            // d：整数（10 進数）を指定します。
            // 結果として,month変数を文字列に変換する際に,2桁の数字として表示されます。例えば,月が5の場合、05という文字列が返されます。
            String monthStr = String.format("%02d", month);
            String dayStr = String.format("%02d", day);

            String weekStr = ""; //week变量赋值给weekStr，switch语句检查week的值是否与Calendar类中定义的常量值（如Calendar.SUNDAY）相等
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


        
        
    

    


