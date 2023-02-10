package JSample;

public class JSample7_8 {

    public static void main(String[] args) {
        String str = "東京,大阪,京都,北海道";
        String[]city = str.split(",");
        for (int i = 0; i<city.length; i++) {
            System.out.println(i + "番目の要素 = :" + city[i]);
        }
    }    
    
}
