package JSample;

public class JSample7_2 {

    public static void main(String[] args) 
    {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "ab";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        if (str1 == str2) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
        str3 = str3 + "c";
        System.out.println("str1 = " + str1);
        System.out.println("str3 = " + str3);
        if (str1 == str3) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
        System.out.println("equalsメソッドで比較");
        if (str1.equals(str3)) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
    }
}
