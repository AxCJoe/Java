package JSample;

public class tihuan2 {
    public static void main(String[] arges)
    {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
            arr[i] = 0;
            System.out.println(arr[i]);
            }
        }
    }

}
