package JFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JSample18_1 {

    public static void main(String args[]) throws IOException {
        File file = new File("C:\\Test\\abc.txt");
        if (file.exists()) {
            canReadWrite(file);
            FileReader fr = new FileReader(file);
            int frs;
            while ((frs = fr.read()) != -1) {
                System.out.print((char) frs);
            }
            fr.close();
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
