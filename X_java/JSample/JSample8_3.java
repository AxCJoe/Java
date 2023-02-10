package JSample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JSample8_3 {
    
    public static void main(String[] args)
    {
        Date date = new Date(); // 今日の日付
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(date);
        System.out.println(date); 
        System.out.println(strDate); 
    }
    

}
