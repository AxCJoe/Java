package JSample;
public class JSample6_1 {

    public static void main(String[]agrs)
    {
        String[]cars = {"Volvo","BMW","Ford","Mazda"};
        for(int i = 0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
        System.out.println();

        String[] carss = {"Volvo","BMW","Ford","Mazda"};
        for(String f : carss)
        {
            System.out.println(f);
        }
        System.out.println();

        int[][]myNumbers = {{1,2,3,4},{5,6,7}};
        int x = myNumbers[1][2];
        System.out.println(x);
        System.out.println();
    }
    String str;
    str = "abc";
    str = str + "def";
    // abcdef
    System.out.println(str);
    
}
