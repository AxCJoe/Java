package JFile;

import java.io.File;

public class JSample17_6 {

    public static void main(String args[]) {
        File file = new File("C:\\Users\\user\\Desktop\\X_java\\suv");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("ファイルを削除しました");
            } else {
                System.out.println("ファイルの削除に失敗しました");
            }
        } else {
            System.out.println("ファイルが見つかりません");
        }
    }
    
}
