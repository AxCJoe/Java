package JFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSample18_5 {
    public static void main(String args[]) {
        try {
            File file = new File("C:\\Test\\writetest.txt");
            if (fileFile(file)) {
                FileWriter fw = new FileWriter(file, true);
                fw.write("私は○○と申します。\r\n");
                fw.write("宜しくお願い致します。\r\n");
                fw.close();
                System.out.println("ファイルに追加しました");
            } else {
                System.out.println("ファイルに書き込めません");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private static Boolean fileFile(File file) {
        if (file.exists()) {
            if (file.isFile() && file.canWrite()) {
                return true;
            }
        }
        return false;
    }
}
