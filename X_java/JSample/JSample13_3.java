package JSample;


    class SuperClassSample {
        String str = "SuperClass";
        public String getSrt() {
            return str;
        }
    }
    class SubClassSample extends SuperClassSample {
        String str = "SubClass";
        public String getSrt() {
            return str;
        }
        public void print() {
            System.out.println("super.str = " + super.str);
            System.out.println("str = " + str);
            System.out.println("super.getSrt() = " + super.getSrt());
            System.out.println("getSrt() = " + getSrt());
        }
    }
    public class JSample13_3 {
        public static void main(String[] args) {
            SubClassSample scs = new SubClassSample();
            scs.print();
        }
    }