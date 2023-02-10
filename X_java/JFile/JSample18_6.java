package JFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JSample18_6 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("キーボードから入力してください");
        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("入力された文字は「" + str + "」です");
    }
}
