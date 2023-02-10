package JFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSample18_3 {
    
    public static void main(String args[]) {
        try {
            File file = new File("C:\\Test\\abc123.txt");
            if (fileFile(file)) {
                System.out.println("ファイルは存在し、読み込み可能です。");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String fileLine = null;
                while ((fileLine = br.readLine()) != null) {
                    System.out.println(fileLine);
                }
                br.close();
            } else {
                System.out.println("ファイルが見つからないか開けません");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Boolean fileFile(File file) {
        if (file.exists()) {
            if (file.isFile() && file.canRead()) {
                return true;
            }
        }
        return false;
    }


}
