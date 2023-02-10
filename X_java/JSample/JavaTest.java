package JSample;

import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {

		// 文字列を入力
		System.out.println("文字列を入力してください。");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		scan.close();


		String[] newStr = str.split(",");

		String str2 = str.substring(0,2);
		String str3 = str.substring(4,7);
		// 配列のサイズを判断
		if (newStr.length == 0 ) {
			System.out.println("入力した文字列のサイズが0です。");
		} else {
			for (int i = 0; i < newStr.length; i++) {

				// 文字列が8桁数値であるかを判断
				if (newStr.length != 8) {
					System.out.println(i+1 + " 番目の文字列「" + newStr[i] + "」が郵便番号（例：123-4567）ではありません。");

				} else {
					// 文字列が郵便番号であるかを判断
					if (newStr[3]!="-") {
						System.out.println(i+1 + "番目の文字列「" + newStr[i] + "」が郵便番号（例：123-4567）ではありません。");
					}else {

						if(!Character.isDigit(str2.charAt(i))) {
							System.out.println(i+1 + "番目の文字列「" + newStr[i] + "」が郵便番号（例：123-4567）ではありません。");
						}else if(!Character.isDigit(str3.charAt(i))){
							 {
								System.out.println(i+1 + "番目の文字列「" + newStr[i] + "」が郵便番号（例：123-4567）ではありません。");
							}

						}

					}
					}
				}
			}

	}

}