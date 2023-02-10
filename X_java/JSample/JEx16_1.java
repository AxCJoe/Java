package JSample;

public class JEx16_1 {
  
    public class Factorial {
        public static void main(String[] args) {
            System.out.println("1! = " + fac(1));
            System.out.println("2! = " + fac(2));
            System.out.println("3! = " + fac(3));
            System.out.println("4! = " + fac(4));
            System.out.println("5! = " + fac(5));
            System.out.println("6! = " + fac(6));
            System.out.println("7! = " + fac(7));
            System.out.println("8! = " + fac(8));
            System.out.println("9! = " + fac(9));
            System.out.println("10! = " + fac(10));
        }
        
        public static int fac(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) 
            {
                result *= i;
            }
            return result;
        }
    }
}
