package JSample;

public class JSample11_3 {

    public static void main(String[] args) {
        int english = 58;
        check("英語", english);
    }
    private static void check(String language, int score) {
        System.out.print("この応募者の" + language + "能力は");
        if (score > 70) {
            System.out.println("ビジネスレベルです。");
        } else {
            System.out.println("日常会話レベルです。");
        }
    }
    
}
