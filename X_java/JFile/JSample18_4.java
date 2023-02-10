package JFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JSample18_4 {
    public static void main(String args[]) {
        try {
            File file = new File("C:\\Test\\writetest.txt");
            if (fileFile(file)) {
                System.out.println("ファイルは存在し、書き込み可能です。");
                FileWriter fw = new FileWriter(file);
                fw.write("おはようございます！\r\n");
                fw.write("初めまして、\r\n");
                fw.close();
                System.out.println("ファイルに書き込みました");
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
