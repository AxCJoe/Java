package JSample;

public class ArithmeticExceptionTest {
    
    public class ArithmeticExceptionTest {
        public static void main(String[] args) {
            System.out.println(" Exception in thread \"main\"");
            for (int i = 10; i > 0; i--) {
                System.out.print(" " + (i / (i - 1)));
                if (i % 5 == 0)
                    System.out.println();
            }
        }
    }

}
