package JSample;

import java.util.Scanner;

import javax.swing.plaf.BorderUIResource;

public class JEx4_1 {

    public static void main(String[] agrs) {
        System.out.println("Scoreを入力してください:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num >= 60) {
            System.out.println("60以上です");
        } else {
            System.out.println("60未満です");
        }
    }

}
