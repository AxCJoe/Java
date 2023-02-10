package JSample;

import java.util.Scanner;

public class JEx11_1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("キーボードから数値1を入力してください。");
        int n1 = scan.nextInt();
        System.out.println("キーボードから数値2を入力してください。");
        int n2 = scan.nextInt();
        Num num = new Num();
        int k = num.test(n1, n2);
        System.out.println(n1 + " と " + n2 + " 比較的な最大値は：" + k);
    }

}
