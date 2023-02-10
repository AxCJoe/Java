package JFile;

import java.io.File;
import java.io.IOException;

public class JSample17_7 {

    public static void main(String args[]) {
        File file = new File("C:\\Test\\test.txt");
        // test.txtの作成
        if (file.exists()) {
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
        }
        // test.txtファイルの読み込みと書き込みの可・否を確認
        canReadWrite(file);
        if (file.setReadOnly()) {
            System.out.println("ファイルを読み取り専用にしました");
        } else {
            System.out.println("読み取り専用に変更が失敗しました");
        }
    }
    private static void canReadWrite(File file) {
        if (file.canRead()) {
            System.out.println("ファイルは読み込み可能です");
        }
        if (file.canWrite()) {
            System.out.println("ファイルは書き込み可能です");
        }
    }
    
}
