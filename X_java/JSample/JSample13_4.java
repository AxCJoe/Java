package JSample;

class A {
    public void show() {
        System.out.println("super classのprint メソッド!");
    }
}
class B1 extends A {
    public void show() {
        System.out.println("sub classのprint メソッド!");
    }
}
class B2 extends A {
}
class JSample13_4 {
    public static void main(String args[]) {
        B1 b1 = new B1();
        b1.show();
        B2 b2 = new B2();
        b2.show();
    }
}