package JSample;

import java.util.Scanner;

import javax.swing.plaf.BorderUIResource;

public class JSample4_2 {
    public static void main(String[]agrs)
    {
        System.out.println("キーボードから数値を入力してください:");
        Scanner scan = new Scanner(System.in);
        //数値を読み取る；String num = scanner,next();の場合,文字を読み取る;
        int num = scan.nextInt();

        switch(num)
        {
            case 1:
            System.out.println("非常に不満");
            break;
            case 2:
            System.out.println("少し不満");
            case 3:
            System.out.println("どちらとも言えない");
            break;
            case 4:
            System.out.println("少し満足");
            break;
            case 5:
            System.out.println("大変満足");
            break;

        }

    }

    
    
}
