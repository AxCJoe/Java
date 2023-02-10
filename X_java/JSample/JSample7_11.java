package JSample;

public class JSample7_11 {

    public static void main(String[] args) {
        String str = "MNO";
        System.out.println(str.compareTo("ABC"));   // 結果：12
        System.out.println(str.compareTo("MNO"));   // 結果：0
        System.out.println(str.compareTo("XYZ"));   // 結果：-11
        System.out.println(str.compareToIgnoreCase("mno")); // 結果：0
 }
    
}
