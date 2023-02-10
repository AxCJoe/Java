package JSample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSample8_5 {

    public static void main(String[] args) throws ParseException {
        String strDate = "2018-12-31";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(strDate);
        System.out.println(date); // => Mon Dec 31 00:00:00 JST 2018
    }
    
}
