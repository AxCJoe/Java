package JFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JEx18_2 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\X_java\\file.txt"));
      String line;
      int count = 0;
      while ((line = br.readLine()) != null) {
        count += line.split("Thanks").length - 1;
      }
      br.close();
      System.out.println("'Thanks': " + count);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
// このコードは、ファイル名が "file.txt" のテキストファイルから1行ずつ読み込み、単語 "Thanks" の出現回数を数えます。




