package JSample;

public class JEx6_1 {
    public static void main(String[]agrs)
    {
        int[] cars = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i<cars.length;i++)
        {
            if(cars[i]%2==0)
            {
                System.out.println(cars[i]);
            }
            else
            {
                System.out.println();
            }
        }
    }
    
}
