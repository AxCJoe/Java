package JFile;

import java.io.File;
import java.io.IOException;

public class JSample17_4 {
    public static void main(String args[]) {
        File newfile = new File("C:\\Users\\user\\Desktop\\X_java\\newtest.txt");
        try {
            if (newfile.createNewFile()) {
                System.out.println("ファイルの作成に成功しました");
            } else {
                System.out.println("ファイルの作成に失敗しました");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
