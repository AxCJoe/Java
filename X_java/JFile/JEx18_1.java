package JFile;

import java.util.Scanner;

public class JEx18_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 2; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        System.out.println("Sum of factorials from 1 to " + n + " is: " + sum);
    }
}


// 1!+2!+3!+…+n! を計算するプログラムをつくれ。ただし、n は キーボードで与えるものとする。
//3! = 3 × 2 × 1 = 6