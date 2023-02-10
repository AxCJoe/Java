package JFile;

import java.io.File;

public class JSample17_5 {

    public static void main(String args[]) {
        File newfile = new File("C:\\Users\\user\\Desktop\\X_java\\suv");
        if (newfile.mkdir()) {
            System.out.println("ディレクトリの作成に成功しました");
        } else {
            System.out.println("ディレクトリの作成に失敗しました");
        }
    }
    
}
