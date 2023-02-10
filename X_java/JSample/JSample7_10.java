package JSample;

public class JSample7_10 {

        public static void main(String[] args) {
            String str = "沖縄出身の私は沖縄の雰囲気が好きです。";
            System.out.println("変換前:");
            System.out.println(str);
            str = str.replaceAll("沖縄", "東京");
            System.out.println("変換後:");
            System.out.println(str);
        }
}
