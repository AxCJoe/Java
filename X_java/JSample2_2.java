public class JSample2_2 {

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        {
            int five = 5;
            int nine = 9;
            System.out.println("one:" + one);
            System.out.println("five:" + five);

        }
        {
            int six = 6;
            int eight = 8;
            System.out.println("six:" + six);
            System.out.println("nine:" + nine);
        }
        System.out.println("two:" + two);
        System.out.println("eight:" + eight);
    }

}
