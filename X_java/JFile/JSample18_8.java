package JFile;

import java.util.Scanner;

public class JSample18_8 {
    public static void main(String[] args) {
        System.out.println("キーボードから入力してください");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("入力された文字は「" + num + "」です");
    }
}
