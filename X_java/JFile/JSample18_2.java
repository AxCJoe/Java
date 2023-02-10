package JFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSample18_2 {
    public static void main(String args[]) {
        try {
            File file = new File("C:\\Test\\test.txt");
            if (fileFile(file)) {
                System.out.println("ファイルは存在し、読み込み可能です。");
                FileReader fr = new FileReader(file);
                int frs;
                while ((frs = fr.read()) != -1) {
                    System.out.print((char) frs);
                }
                fr.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static boolean fileFile(File file) {
        if (file.exists()) {
            if (file.isFile() && file.canRead()) {
                return true;
            }
        }
        return false;
    }
}
