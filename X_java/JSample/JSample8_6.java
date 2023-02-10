package JSample;
import java.text.ParseException;
import java.util.Date;

public class JSample8_6 {
    public static void main(String[] args) throws ParseException {
        String strDate = "2018-12-31";
        Date sqlDate = java.sql.Date.valueOf(strDate);
        System.out.println(sqlDate); // => 2018-12-31
    }
}
