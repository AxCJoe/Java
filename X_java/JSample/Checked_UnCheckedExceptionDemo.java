package JSample;

public class Checked_UnCheckedExceptionDemo {
    
    public class Checked_UnCheckedExceptionDemo {
        public static void main(String[] args) {
            uncheckedFunction1();
            //実行中、uncheck exception発生、実行中止
            uncheckedFunction2();
            try {
                checkFunction();
            }catch (MyCheckException e){
                throw new RuntimeException(e);
            }
        }
        public static void uncheckedFunction1() {
            //メソッドの中に、exception発生、必ず処理。try-catch Or throw
            System.out.println("uncheckedFunction1()が実行された");
            throw new NullPointerException();
        }
        public static void uncheckedFunction2() throws IllegalArgumentException {
            System.out.println("uncheckedFunction2()が実行された");
            // 呼び出し時、catchしない
        }
        public static void checkFunction() throws MyCheckException {
            System.out.println("invoke test3");
            //check exception発生、必ず処理。try-catch
        }
    }
    class MyCheckException extends Exception {
            public MyCheckException() {
                super();
            }
    }

}
